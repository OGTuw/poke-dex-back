package com.pokedex.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "Pokedex API", version = "1.0.0", description = "PokedexのAPIです。"))
@SpringBootApplication
@RestController
public class PokedexApplication {

	// @RequestMapping("/")
	// public String home() {
	// 	return "Hello Spring World";
	// }

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}

}
