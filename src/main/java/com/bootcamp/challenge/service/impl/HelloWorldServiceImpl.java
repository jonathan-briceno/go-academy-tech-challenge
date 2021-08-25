package com.bootcamp.challenge.service.impl;

import com.bootcamp.challenge.service.HelloWorldService;
import com.bootcamp.challenge.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String getHelloWorld() {
        return Constants.HELLO_WORLD;
    }
}
