package com.bootcamp.challenge.service.impl;

import com.bootcamp.challenge.utils.Constants;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:./application.properties")
public class HelloWorldServiceTest {

    @Autowired
    HelloWorldServiceImpl helloWorldService;

    @Test
    public void helloWorldService_success() {
        String result = helloWorldService.getHelloWorld();
        Assert.assertEquals(Constants.HELLO_WORLD, result);
    }
}
