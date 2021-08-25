package com.bootcamp.challenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Dog {

    private String name;
    @JsonProperty("life_span")
    private String lifeSpan;
    private String temperament;

}
