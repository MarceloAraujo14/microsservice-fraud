Implementing communication between microservices developed in Java.

Project:

The project idea includes the registration of a customer, whose data is sent to the validation service and identifies if the attempt to register could be a fraud.

The registration service communicates with the fraud identification service through RestTemplate and Service Discovery.

Note: The validation logic was not implemented, as the focus of the project is the communication between the services.

###Techs:
 - Java 17
 - Maven
 - SpringFramework
 - PostgreSQL
 - MongoDB
 - Docker
 - Netflix Eureka Server
 - Kafka
 - Postman
