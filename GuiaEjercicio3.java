/*
 Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
último, el segundo, el penúltimo, el tercero, etc.
 */

package com.mycompany.guiaejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class GuiaEjercicio3 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        JOptionPane.showMessageDialog(null, "Ingrese 10 números: ");

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(input);
        }
        
         for (int i = 0; i < 10 / 2; i++) {
            JOptionPane.showMessageDialog(null, numeros[i]);
            JOptionPane.showMessageDialog(null,numeros[9 - i]);
        }

        if (10 % 2 != 0) {
            JOptionPane.showMessageDialog(null,numeros[10 / 2]);
        }
    }
}
