package Pokemon;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        if(getPokemons(pokemon.name) == null){
            pokemons.put(pokemon.name, new ArrayList<>());

        }
        getPokemons(pokemon.name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        ArrayList<Pokemon> Pokemon_List = getPokemons(name);
        if(Pokemon_List == null){
            return null;
        }
        Pokemon strongest = null;
        for(Pokemon pokemon : getPokemons(name)){
            if(strongest == null || pokemon.cp > strongest.cp){
                strongest = pokemon;
            }
        }
        return strongest;
    }

    public Pokemon getStrongest() {
        Pokemon strongest = null;

        for (String key : pokemons.keySet()) {
            Pokemon p = getStrongest(key);


        if (strongest == null || p.cp > strongest.cp) {
            strongest = p;
         }
        }
        return strongest;
    }
}