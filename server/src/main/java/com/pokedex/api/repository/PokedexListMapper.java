package com.pokedex.api.repository;

import java.util.ArrayList;

import com.pokedex.api.model.PokedexList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PokedexListMapper {
    ArrayList<PokedexList> findPokedexList();
}