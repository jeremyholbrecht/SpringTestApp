package be.intecbrussel.services;

import be.intecbrussel.entities.Pokemon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    private List<Pokemon> pokemons = new ArrayList<>();

    public PokemonServiceImpl(){
        pokemons.add(new Pokemon(1,"Bulbasaur","Grass"));
        pokemons.add(new Pokemon(2,"Ivysaur", "Grass"));
        pokemons.add(new Pokemon(3, "Venusaur", "Grass"));
        pokemons.add(new Pokemon(4,"Charmander","Fire"));
        pokemons.add(new Pokemon(5,"Charmeleon", "Fire"));
        pokemons.add(new Pokemon(6, "Charizard", "Fire"));
        pokemons.add(new Pokemon(7,"Squirtle","Water"));
        pokemons.add(new Pokemon(8,"Wartortle", "Water"));
        pokemons.add(new Pokemon(9, "Blastoise", "Water"));
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemons;
    }

    @Override
    public Pokemon getPokemonById(int id) {
        return pokemons.stream()
                .filter(p -> p.getId()==(id))
                .findFirst()
                .get();
    }

    @Override
    public void createPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
}
