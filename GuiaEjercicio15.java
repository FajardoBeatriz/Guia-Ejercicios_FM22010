/*
Dado un conjunto de nombres de Pokémon almacenados en un array y otro conjunto
de sus respectivas cantidades de poder almacenadas en otro array, se solicita al 
usuario ingresar un nombre de Pokémon y una cantidad de poder. El objetivo es buscar 
el nombre del Pokémon proporcionado por el usuario en el array de nombres. Si se 
encuentra el nombre del Pokémon en el array, se actualizará la cantidad de poder 
asociada a ese Pokémon con la cantidad proporcionada por el usuario.

String[] nombresPokemon = {"pikachu", "charizard", "bulbasaur", "squirtle", "jigglypuff"};

int[] poderesPokemon = {100, 150, 80, 90, 120};
 */

package com.mycompany.guiaejercicio15;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio15 {

    public static void main(String[] args) {
        String[] nombresPokemon = {"pikachu", "charizard", "bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del Pokémon: ");
        String nombreIngresado = scanner.next();

        System.out.print("Ingrese la cantidad de poder: ");
        int cantidadPoder = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < nombresPokemon.length; i++) {
            if (nombresPokemon[i].equals(nombreIngresado)) {
                poderesPokemon[i] = cantidadPoder;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Se actualizó la cantidad de poder para " + nombreIngresado + " a " + cantidadPoder + ".");
        } else {
            System.out.println("El Pokémon no se encontró en la lista.");
        }

        System.out.println("Lista actualizada de Pokémon y poderes:");
        for (int i = 0; i < nombresPokemon.length; i++) {
            System.out.println(nombresPokemon[i] + ": " + poderesPokemon[i]);
        }
    }
}