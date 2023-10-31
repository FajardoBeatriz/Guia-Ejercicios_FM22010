/*
 Pedir al usuario el nombre de un pokemon, buscarlo en el siguiente array si se
encuentra mostrar el indice en el que se encontro sino mostrar un mensaje
adecuado notificandolo
 */

package com.mycompany.guiaejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class GuiaEjercicio12 {

    public static void main(String[] args) {
            String[] nombresPokemonB = {
            "Venusaur",
            "Blastoise",
            "Dragonite",
            "Gyarados",
            "Alakazam",
            "Arcanine",
            "Lapras",
            "Golem",
            "Gyarados",
            "Rhydon"
        };

        String nombrePokemon = JOptionPane.showInputDialog("Introduce el nombre de un Pokémon: ");

        int indiceEncontrado = -1;

        for (int i = 0; i < nombresPokemonB.length; i++) {
            if (nombrePokemon.equalsIgnoreCase(nombresPokemonB[i])) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            JOptionPane.showMessageDialog(null, "El Pokémon " + nombrePokemon + " se encuentra en el índice " + indiceEncontrado + " del array.");
        } else {
            JOptionPane.showMessageDialog(null, "El Pokémon " + nombrePokemon + " no se encontró en el array.");
        }

    }
}