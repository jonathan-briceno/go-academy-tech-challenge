package com.bootcamp.challenge.service.impl;

import com.bootcamp.challenge.client.DogRestTemplate;
import com.bootcamp.challenge.model.Dog;
import com.bootcamp.challenge.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    private DogRestTemplate dogRestTemplate;

    @Override
    public List<Dog> getDogs(String dogBreed) {
        return dogRestTemplate.getDogsFromApi(dogBreed);
    }
}
