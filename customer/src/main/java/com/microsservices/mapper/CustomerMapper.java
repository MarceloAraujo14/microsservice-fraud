package com.microsservices.mapper;

import com.microsservices.customer.Customer;
import com.microsservices.customer.CustomerRegistrationRequest;
import org.modelmapper.ModelMapper;

public record CustomerMapper(ModelMapper mapper) {

    public Customer toCustomer(CustomerRegistrationRequest request){
        return mapper.map(request, Customer.class);
    }
}
