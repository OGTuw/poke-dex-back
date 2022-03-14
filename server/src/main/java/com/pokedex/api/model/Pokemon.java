package com.pokedex.api.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pokemon")
public class Pokemon implements Serializable {
    @Id
    private Integer id;

    @NotBlank
    private String identifier;

    @NotNull
    private Integer species_id;

    @NotNull
    private Integer height;

    @NotNull
    private Integer weight;

    @NotNull
    private Integer base_experience;

    @NotNull
    private Integer order;

    @NotNull
    private Boolean is_default;
}
