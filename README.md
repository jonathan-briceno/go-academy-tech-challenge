# go-academy-tech-challenge

## Status Overview 

[![Build Status](https://app.travis-ci.com/jonathan-briceno/go-academy-tech-challenge.svg?branch=main)](https://app.travis-ci.com/jonathan-briceno/go-academy-tech-challenge) [![Coverage Status](https://coveralls.io/repos/github/jonathan-briceno/go-academy-tech-challenge/badge.svg)](https://coveralls.io/github/jonathan-briceno/go-academy-tech-challenge)

## How to Run This App 

### From the command line 

Place yourself on the repository's root folder i.e ```/user/docs/go-academy-tech-challenge```

run ```mvn clean install``` to build the app 

and then run 

```mvn spring-boot:run```

### How to use this app 

This API has two endpoints available

```GET http://localhost:8080/api/hello-world``` where you will get the classic "Hello, World."

```GET http://localhost:8080/api/v1/dogs/breed/{dogName}``` where you will get summarized information from certain dog breeds

The input dogName can be as the following: hound, shih tzu, terrier, etc and it will return all dogs which name contains that word. 

You can also send single letters like: ```m``` and you will get results than contain that letter like: Alaskan Malamute or American Foxhound

You can also send partial parts of the name like: ```chi``` and you will get results like Chihuahua and Chinese Crested 

Once the app is up you can also try the dogs API from the API's swagger on: ```http://localhost:8080/api/swagger-ui.html``` from the browser 

## Technical Specs

- Java 8 (1.8.0_241)
- Maven 3.6.3 
- spring-boot 2.5.4