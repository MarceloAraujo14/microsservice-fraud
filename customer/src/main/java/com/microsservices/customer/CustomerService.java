package com.microsservices.customer;

import com.microsservices.customer.mapper.CustomerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class CustomerService {

    private final RestTemplate template;
    private final CustomerMapper mapper;
    private final CustomerRepository customerRepository;

    public CustomerService(RestTemplate template, CustomerMapper mapper, CustomerRepository customerRepository) {
        this.template = template;
        this.mapper = mapper;
        this.customerRepository = customerRepository;
    }

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        log.info(" request {}",customerRegistrationRequest);
        Customer customer = mapper.toCustomer(customerRegistrationRequest);
        log.info("mapper {}", customer);
        customerRepository.saveAndFlush(customer);
        FraudCheckResponse checkResponse = template.getForObject(
                "http://FRAUD:8082/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );
        if (checkResponse.isFraudster()){
            throw new IllegalStateException("fraudster");
        }
    }
}
