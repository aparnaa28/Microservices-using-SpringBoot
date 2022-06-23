# Microservices-using-SpringBoot

A simple springboot project implemented using Microservices architecture.
Microservices created:
1. Department-service --> provides the detail of the department to which user belongs
2. User service --> Provides user information along with department info to which user belongs.
3. Service registry --> to maintain record of all the microservices being used in the project.
4. cloud gateway--> An API gateway so that all the requests traverse through this gateway.
5. Cloud-config-server --> uses github to store all the external configurations common for each microservices.

This project also implements circuit breaker to handle fallback mechanism.
