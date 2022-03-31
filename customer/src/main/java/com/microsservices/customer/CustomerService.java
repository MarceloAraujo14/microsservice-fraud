package com.microsservices.customer;

import com.microsservices.customer.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerMapper mapper;
    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = mapper.toCustomer(customerRegistrationRequest);
        customerRepository.save(customer);
    }
}
