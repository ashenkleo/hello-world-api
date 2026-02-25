# Hello World API

This project implements a simple HTTP API in Java using Spring Boot.
The application exposes a single endpoint:

# Architecture & Design
The application follows a layered structure:

• Controller: Handles HTTP requests and responses only. 

• Service: Contains business validation logic and formatting.

# Assumptions Made

1. Only standard English alphabet characters (A–Z) are considered valid.

2. Whitespaces at the start and the end are ignored.

3. No response formatting is required

# Running the Application
1. Clone the repository

```
git clone https://github.com/ashenkleo/hello-world-api.git
cd hello-world-api
```
2. Build the project
```
mvn clean install
```
3. Run the application
```
mvn spring-boot:run
The application will start on:
http://localhost:8080
```

# Running Tests
```
mvn test
```
