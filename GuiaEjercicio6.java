/*
 Dado los siguientes Arrays mezclar los nombres de Pokémon de los arrays
nombresPokemonA y nombresPokemonB en un tercer array
nombresPokemonC de la forma el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.),
 */

package com.mycompany.guiaejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class GuiaEjercicio6 {

    public static void main(String[] args) {
        String[] nombresPokemonA = {"Pikachu","Charizard","Bulbasaur","Squirtle","Jigglypuff","Eevee","Mewtwo","Snorlax","Gengar","Machamp"};
        String[] nombresPokemonB = {"Venusaur","Blastoise","Dragonite","Gyarados","Alakazam","Arcanine","Lapras","Golem","Gyarados","Rhydon"};
        String[] nombresPokemonC = new String[nombresPokemonA.length *2];
        
        int c=0;
         for(int i=0; i<nombresPokemonA.length;i++){
             nombresPokemonC[c]=nombresPokemonA[i];
             c++;
             nombresPokemonC[c]=nombresPokemonB[i];
             c++;
            }
         
         for (int i = 0; i < nombresPokemonC.length; i++) {
             JOptionPane.showMessageDialog(null,nombresPokemonC[i]);
            }

    }
}
