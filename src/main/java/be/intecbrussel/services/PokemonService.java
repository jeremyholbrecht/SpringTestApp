package be.intecbrussel.services;

import be.intecbrussel.entities.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> getAllPokemon();
    Pokemon getPokemonById(int id);
    void createPokemon(Pokemon pokemon);
    void updatePokemon(Pokemon pokemon, int id);
    void deletePokemon(int id);
}
