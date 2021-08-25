package com.bootcamp.challenge.controller.dogs;

import com.bootcamp.challenge.client.DogRestTemplate;
import com.bootcamp.challenge.model.Dog;
import com.bootcamp.challenge.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/dogs")
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping(value = "/breed/{dogBreed}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dog>> getDogs(@PathVariable String dogBreed) {
        List<Dog> result =  dogService.getDogs(dogBreed);
        if(result.isEmpty()) {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(result);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
    }

}
