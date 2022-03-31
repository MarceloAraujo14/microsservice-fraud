package com.microsservices.fraud;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class FraudCheckHistory {

    @Id
    private String id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

    public FraudCheckHistory(String id, Integer customerId, Boolean isFraudster, LocalDateTime createdAt) {
        this.id = id;
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = createdAt;
    }

    public FraudCheckHistory(Integer customerId, Boolean isFraudster, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = createdAt;
    }

    public FraudCheckHistory() {
    }
}
