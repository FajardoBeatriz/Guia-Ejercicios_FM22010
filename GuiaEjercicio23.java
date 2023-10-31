/*
"POKEDEX" Permite al usuario ingresar el nombre de un Pokémon y muestra sus
estadísticas completas si se encuentra.

String[][] estadisticasPokemon = {
{"Pikachu", "90", "55", "40", "35"},
{"Charizard", "100", "84", "78", "78"},
{"Bulbasaur", "45", "49", "49", "45"},
{"Squirtle", "43", "48", "65", "44"},
{"Mewtwo", "130", "110", "90", "106"},
{"Gengar", "110", "65", "60", "60"},
{"Dragonite", "80", "134", "95", "91"},
{"Snorlax", "30", "110", "65", "160"},
{"Vaporeon", "65", "60", "95", "130"},
{"Machamp", "55", "130", "80", "90"},
{"Eevee", "55", "55", "50", "55"},
{"Alakazam", "120", "50", "45", "55"},
{"Lapras", "60", "85", "80", "130"},
{"Gyarados", "81", "125", "79", "95"},
{"Jigglypuff", "20", "45", "20", "115"}
};

// Columna 0: Nombre del Pokémon
// Columna 1: Velocidad
// Columna 2: Ataque
// Columna 3: Defensa
// Columna 4: HP
 */

package com.mycompany.guiaejercicio23;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio23 {

    public static void main(String[] args) {

        String[][] estadisticasPokemon = {
            {"Pikachu", "90", "55", "40", "35"},
            {"Charizard", "100", "84", "78", "78"},
            {"Bulbasaur", "45", "49", "49", "45"},
            {"Squirtle", "43", "48", "65", "44"},
            {"Mewtwo", "130", "110", "90", "106"},
            {"Gengar", "110", "65", "60", "60"},
            {"Dragonite", "80", "134", "95", "91"},
            {"Snorlax", "30", "110", "65", "160"},
            {"Vaporeon", "65", "60", "95", "130"},
            {"Machamp", "55", "130", "80", "90"},
            {"Eevee", "55", "55", "50", "55"},
            {"Alakazam", "120", "50", "45", "55"},
            {"Lapras", "60", "85", "80", "130"},
            {"Gyarados", "81", "125", "79", "95"},
            {"Jigglypuff", "20", "45", "20", "115"}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un Pokémon: ");
        String nombrePokemon = scanner.nextLine();

        boolean encontrado = false;
        for (String[] pokemon : estadisticasPokemon) {
            if (pokemon[0].equalsIgnoreCase(nombrePokemon)) {
                encontrado = true;
                System.out.println("Estadísticas de " + nombrePokemon + ":");
                System.out.println("Velocidad: " + pokemon[1]);
                System.out.println("Ataque: " + pokemon[2]);
                System.out.println("Defensa: " + pokemon[3]);
                System.out.println("HP: " + pokemon[4]);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El Pokémon " + nombrePokemon + " no se encuentra en la Pokédex.");
        }
        scanner.close();
    }
}