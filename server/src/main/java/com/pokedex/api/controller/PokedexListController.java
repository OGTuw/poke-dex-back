package com.pokedex.api.controller;

import java.util.List;

import com.pokedex.api.model.PokemonList;
import com.pokedex.api.model.CompletePokemonList;
import com.pokedex.api.repository.PokedexListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class PokedexListController {
     @Autowired
     PokedexListRepository repository;
    
     @Operation(summary = "リストを取得します。")
     @RequestMapping("/api/pokedex-list")
     List<PokemonList> findPokedexList() {
         List<PokemonList> list = repository.findPokemonList();

         return list;
     }
}
