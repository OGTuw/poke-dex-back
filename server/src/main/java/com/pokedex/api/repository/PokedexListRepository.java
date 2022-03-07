package com.pokedex.api.repository;

import com.pokedex.api.model.Pokemon;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokedexListRepository extends JpaRepository<Pokemon, Integer> {}