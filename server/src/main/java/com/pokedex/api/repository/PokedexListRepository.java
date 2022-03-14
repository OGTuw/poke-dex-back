package com.pokedex.api.repository;

import java.util.List;

import com.pokedex.api.model.PokemonList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PokedexListRepository extends JpaRepository<PokemonList, Integer> {
    @Query(value = "select pokemon.id, pokemon.name, types.type, pokemon_types.slot "
        + "from pokemon, pokemon_types, types "
        + "where pokemon.id = pokemon_types.pokemon_id AND pokemon_types.type_id = types.id "
        + "order by pokemon.id ",
        nativeQuery = true)
    List<PokemonList> findPokemonList();
}