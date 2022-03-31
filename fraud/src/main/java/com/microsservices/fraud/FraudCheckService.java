package com.microsservices.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckRepository fraudCheckRepository;

    public boolean isCustomerFraudulent(Integer customerId){
        fraudCheckRepository.save(
                new FraudCheckHistory(
                        customerId,
                        false,
                        LocalDateTime.now()
                )
        );
        return false;
    }
}
