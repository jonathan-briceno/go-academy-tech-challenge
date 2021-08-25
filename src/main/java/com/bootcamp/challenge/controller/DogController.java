package com.bootcamp.challenge.controller;

import com.bootcamp.challenge.model.Dog;
import com.bootcamp.challenge.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dogs")
public class DogController {

    @Autowired
    private DogService pokemonService;

    @GetMapping(value = "/breed/{dogBreed}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dog> getPokemon(@PathVariable String dogBreed) {
        return pokemonService.getDogs(dogBreed);
    }

}
