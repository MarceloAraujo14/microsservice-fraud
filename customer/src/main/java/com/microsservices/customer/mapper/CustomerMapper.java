package com.microsservices.customer.mapper;

import com.microsservices.customer.Customer;
import com.microsservices.customer.CustomerRegistrationRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerMapper {

    @Autowired
    private ModelMapper mapper;

    public Customer toCustomer(CustomerRegistrationRequest request){
        return mapper.map(request, Customer.class);
    }
}
