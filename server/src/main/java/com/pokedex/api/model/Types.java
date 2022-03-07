package com.pokedex.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "types")
public class Types {
    @Id
    private Integer id;

    @NotBlank
    private String identifier;

    @NotNull
    private Integer generation_id;

    @NotNull
    private Integer damage_class_id;
}
