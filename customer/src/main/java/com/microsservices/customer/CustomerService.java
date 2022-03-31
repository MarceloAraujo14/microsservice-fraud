package com.microsservices.customer;

import com.microsservices.customer.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final RestTemplate template;
    private final CustomerMapper mapper;
    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = mapper.toCustomer(customerRegistrationRequest);
        customerRepository.saveAndFlush(customer);
        FraudCheckResponse checkResponse = template.getForObject(
                "http://localhost:8082/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );
        if (checkResponse.isFraudster()){
            throw new IllegalStateException("fraudster");
        }
    }
}
