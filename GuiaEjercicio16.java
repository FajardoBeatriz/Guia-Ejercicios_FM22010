/*
Encuentra y muestra el nombre del Pokémon con la mayor cantidad de poder

String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur",
"Squirtle"};
int[] poderesPokemon = {100, 150, 80, 90}
 */

package com.mycompany.guiaejercicio16;

/**
 *
 * @author PC
 */
public class GuiaEjercicio16 {

    public static void main(String[] args) {
        String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur", "Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};

        int maxPoder = poderesPokemon[0];
        int indiceMaxPoder = 0;

        for (int i = 1; i < poderesPokemon.length; i++) {
         if (poderesPokemon[i] > maxPoder) {
             maxPoder = poderesPokemon[i];
             indiceMaxPoder = i;
            }
        }

        String nombreMaxPoder = nombresPokemon[indiceMaxPoder];
        System.out.println("El Pokémon con el poder más alto es: " + nombreMaxPoder);

    }
}
