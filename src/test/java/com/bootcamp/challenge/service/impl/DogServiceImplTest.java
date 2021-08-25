package com.bootcamp.challenge.service.impl;

import com.bootcamp.challenge.client.DogRestTemplate;
import com.bootcamp.challenge.model.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class DogServiceImplTest {

    @Mock
    private DogRestTemplate dogRestTemplate;

    @InjectMocks
    private DogServiceImpl dogService;

    private List<Dog> dogs;

    @Before
    public void setup() {

        dogs = Arrays.asList(Dog.builder().name("Basset Hound").temperament("sleepy").build(),
                Dog.builder().name("Beagle").temperament("happy").build());
    }

    @Test
    public void getDogs_success() {
        Mockito.when(dogRestTemplate.getDogsFromApi(any())).thenReturn(dogs);

        List<Dog> result = dogService.getDogs("Hound");
        Assert.assertFalse(result.isEmpty());
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void getDogs_noResults() {
        Mockito.when(dogRestTemplate.getDogsFromApi(any())).thenReturn(Collections.EMPTY_LIST);

        List<Dog> result = dogService.getDogs("Hound");
        Assert.assertTrue(result.isEmpty());
        Assert.assertEquals(0, result.size());
    }


}
