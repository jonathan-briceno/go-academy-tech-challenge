package com.bootcamp.challenge.controller;


import com.bootcamp.challenge.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;


    @GetMapping(value = "/hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld() {
        return helloWorldService.getHelloWorld();
    }


}

