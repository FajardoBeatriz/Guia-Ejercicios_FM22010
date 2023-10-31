/*
 Leer 5 nombres de pokemon y mostralos en orden inverso al introducido.
 */

package com.mycompany.guiaejercicio4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class GuiaEjercicio4 {

    public static void main(String[] args) {
        String[] nombresPokemon = new String[5];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            nombresPokemon[i] = JOptionPane.showInputDialog("Introduce el nombre del Pokémon " + (i + 1) + ": ");
        }
        
        JOptionPane.showMessageDialog(null, "Nombres de Pokémon en orden inverso:");
        for (int i = 4; i >= 0; i--) {
            JOptionPane.showMessageDialog(null, nombresPokemon[i]);
        }
        
        scanner.close();
    }
}      