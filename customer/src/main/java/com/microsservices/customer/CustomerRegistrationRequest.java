package com.microsservices.customer;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegistrationRequest {
   private String firstName;
   private String lastName;
   private String email;
}
