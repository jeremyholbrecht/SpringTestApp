package be.intecbrussel.controllers;

import be.intecbrussel.entities.Pokemon;
import be.intecbrussel.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/pokemon")
    public List<Pokemon> getAllTopics(){
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/pokemon{id}")
        public Pokemon getPokemon(@PathVariable int id ){
            return pokemonService.getPokemonById(id);

    }

    @PostMapping("/pokemon")
    public void addPokemon(@RequestBody Pokemon pokemon){
        pokemonService.createPokemon(pokemon);
    }


}
