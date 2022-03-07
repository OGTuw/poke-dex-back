package com.pokedex.api.controller.v1;

import java.util.List;

import com.pokedex.api.model.Pokemon;
import com.pokedex.api.repository.PokedexListRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RequestMapping("api/v1/pokedex-list")
@RestController
public class PokedexListController {
    PokedexListRepository repository;
    
    @Operation(summary = "リストを取得します。")
    @GetMapping("/")

    List<Pokemon> findPokedexList() {
        return repository.findAll();
    }
}
