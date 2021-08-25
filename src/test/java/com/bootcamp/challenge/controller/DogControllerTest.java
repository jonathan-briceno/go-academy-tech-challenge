package com.bootcamp.challenge.controller;

import com.bootcamp.challenge.ChallengeApplication;
import io.restassured.RestAssured;
import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.with;

import javax.annotation.PostConstruct;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DogControllerTest {

    @LocalServerPort
    private int port;

    private String uri;

    @PostConstruct
    public void init() {
        RestAssured.port = port;
        uri = "http://localhost:" + port;
    }

    @Test
    public void findDogs_success() {
        get("/api/v1/dogs/breed/hound").then().statusCode(200);
    }

    @Test
    public void findDogs_noResults() {
        get("/api/v1/dogs/breed/notadog").then().statusCode(404);
    }



}
