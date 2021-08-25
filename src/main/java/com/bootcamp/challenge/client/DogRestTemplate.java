package com.bootcamp.challenge.client;

import com.bootcamp.challenge.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class DogRestTemplate {

    @Value("${dog.api.url}")
    private String dogApiUrl;

    @Value("${dog.api.key}")
    private String dogApiKey;

    @Autowired
    private RestTemplate restTemplate;

    public List<Dog> getDogsFromApi(String dogName) {

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-agent", "Java/1.8.0_131");
        headers.set("x-api-key", dogApiKey);
        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<List<Dog>> response =
                restTemplate.exchange(
                        dogApiUrl + dogName,
                        HttpMethod.GET,
                        requestEntity,
                        new ParameterizedTypeReference<List<Dog>>() {}
                );

      return response.getBody();

    }

}
