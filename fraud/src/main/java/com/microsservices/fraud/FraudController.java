package com.microsservices.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-chek")
public class FraudController {

    private final FraudCheckService fraudCheckService;


    @PostMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId){
        boolean isFraudulent = fraudCheckService.isCustomerFraudulent(customerId);
        return new FraudCheckResponse(isFraudulent);
    }


}
