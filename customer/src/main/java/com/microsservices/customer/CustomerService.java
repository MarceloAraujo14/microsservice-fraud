package com.microsservices.customer;

import com.microsservices.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerMapper mapper) {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = mapper.toCustomer(customerRegistrationRequest);

    }
}
