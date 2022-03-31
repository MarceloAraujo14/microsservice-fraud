package com.microsservices.fraud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class FraudCheckHistory {

    @Id
    private String id;
    @Indexed(unique = true)
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

    public FraudCheckHistory(Integer customerId, Boolean isFraudster, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = createdAt;
    }



    @Override
    public String toString() {
        return "FraudCheckHistory{" +
                "id='" + id + '\'' +
                ", customerId=" + customerId +
                ", isFraudster=" + isFraudster +
                ", createdAt=" + createdAt +
                '}';
    }
}
