package com.pokedex.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class PokedexList {
    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String image;

    @NotNull
    private String[] types;
}
