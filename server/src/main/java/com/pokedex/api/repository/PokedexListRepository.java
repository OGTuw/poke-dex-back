package com.pokedex.api.repository;

import com.pokedex.api.model.PokedexList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokedexListRepository extends JpaRepository<PokedexList, Integer> {

}