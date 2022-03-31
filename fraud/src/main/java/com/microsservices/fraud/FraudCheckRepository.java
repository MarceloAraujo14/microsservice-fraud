package com.microsservices.fraud;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckRepository extends MongoRepository<FraudCheckHistory, String> {
}
