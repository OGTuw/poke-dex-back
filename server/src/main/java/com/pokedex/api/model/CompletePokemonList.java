package com.pokedex.api.model;

public class CompletePokemonList {
    private Integer id;

    private String name;

    private String[] types;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getTypes() {
        return types;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }
}