package com.pokedex.api.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pokemon_types")
public class PokemonTypes implements Serializable {
    @Id
    private Integer pokemon_id;

    private Integer type_id;

    @NotNull
    private Integer slot;
}
