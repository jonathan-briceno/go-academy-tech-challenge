package com.bootcamp.challenge.service;

import com.bootcamp.challenge.model.Dog;

import java.util.List;

public interface DogService {

    public List<Dog> getDogs(String dogBreed);
}
