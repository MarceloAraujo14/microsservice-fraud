package com.microsservices.customer;

import com.microsservices.customer.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerMapper mapper, CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = mapper.toCustomer(customerRegistrationRequest);
        customerRepository.save(customer);
    }
}
