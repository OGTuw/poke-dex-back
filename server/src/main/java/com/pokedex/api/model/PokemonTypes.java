package com.pokedex.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pokemon_types")
public class PokemonTypes {
    @Id
    private Integer pokemon_id;

    @Id
    private Integer type_id;

    @NotNull
    private Integer slot;
}
