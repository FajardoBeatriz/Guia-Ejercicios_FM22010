/*
Pedir un numero entero (index) validar que este en el rango del array proporcionado
y mostrar el nombre del Pokémon que se encuentra en ese índice.
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
 */

package com.mycompany.guiaejercicio13;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio13 {

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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero (índice): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < nombresPokemonB.length) {
            String nombrePokemon = nombresPokemonB[index];
            System.out.println("El Pokémon en el índice " + index + " es: " + nombrePokemon);
        } else {
            System.out.println("El índice está fuera del rango del array.");
        }

        scanner.close();
    }
}