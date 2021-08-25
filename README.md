# go-academy-tech-challenge

## Status Overview 

[![Build Status](https://app.travis-ci.com/jonathan-briceno/go-academy-tech-challenge.svg?branch=main)](https://app.travis-ci.com/jonathan-briceno/go-academy-tech-challenge) [![Coverage Status](https://coveralls.io/repos/github/jonathan-briceno/go-academy-tech-challenge/badge.svg)](https://coveralls.io/github/jonathan-briceno/go-academy-tech-challenge)

## How to Run This App 

### from the command line 

Place yourself on the repository's root folder i.e ```/user/docs/go-academy-tech-challenge```

run ```mvn clean install``` to build the app 

and then run 

```mvn spring-boot:run```

### How to use this app 

This API has two endpoints available

```GET http://localhost:8080/api/hello-world``` where you will get the classic "Hello, World."

```GET http://localhost:8080/api/v1/dogs/breed/{dogName}``` where you will get summarized information from certain dog breeds (i.e hound, shih tzu, terrier)  

Once the app is up you can also try the API from the API's swagger on: ```http://localhost:8080/api/swagger-ui.html``` from the browser 

## Technical Specs

- Java 8 (1.8.0_241)
- Maven 3.6.3 
- spring-boot 2.5.4