package com.microsservices.customer.mapper;

import com.microsservices.customer.Customer;
import com.microsservices.customer.CustomerRegistrationRequest;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerMapper {

    public ModelMapper mapper;

    public Customer toCustomer(CustomerRegistrationRequest request){
        return mapper.map(request, Customer.class);
    }
}
