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

1. Insert an account in the database and make sure we can get it everytime the app starts
2. Create a REST API service to expose account related operations (GET, PUT, POST, DELETE)
3. Wire the AccountService class into the newly created REST service class
4. Introduce REST endpoint to add a new account (Bonus: Add a validation to avoid duplicate name field values)
5. Introduce REST endpoint to query a single account using the client name
6. Introduce REST endpoint to update an existing account details with client name
7. Introduce REST endpoint to view all accounts in the system
