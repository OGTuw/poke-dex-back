package com.pokedex.api.controller.v1;

import java.util.ArrayList;

import com.pokedex.api.model.PokedexList;
import com.pokedex.api.repository.PokedexListMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RequestMapping("api/v1/pokemon-list")
@RestController
public class PokedexListController {
    PokedexListMapper repository;
    
    @Operation(summary = "リストを取得します。")
    @GetMapping("/")

    ArrayList<PokedexList> findPokedexList() {
        return repository.findPokedexList();
    }
}
