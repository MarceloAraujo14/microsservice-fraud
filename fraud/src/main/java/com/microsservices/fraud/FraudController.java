package com.microsservices.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService fraudCheckService;


    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId){
        boolean isFraudulent = fraudCheckService
                .isCustomerFraudulent(customerId);
        log.info("fraud Request for Customer {}", customerId);
        return new FraudCheckResponse(isFraudulent);
    }


}
