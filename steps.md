**Basic knowledge evaluation**


* Why use spring boot
* What is an API
* What is REST
* Bonus: IOC container
* Spring annotations
  * @SpringBootApplication
  * @Bean
  * @RestController
  * @Singleton

<br>

**Pair programming session**

1. Create a REST API service to expose account related operations (GET, PUT, POST, DELETE)
2. Wire the AccountService class into the newly created REST service class
3. Introduce REST endpoint to add a new account (Bonus: Add a validation to avoid duplicate name field values)
4. Introduce REST endpoint to query a single account using the client name
5. Introduce REST endpoint to update an existing account details with client name
6. Fix the issue in getAllAccounts method in AccountService
7. Introduce REST endpoint to view all accounts in the system
