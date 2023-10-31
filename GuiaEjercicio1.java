//1. Leer 5 números y mostrarlos en el mismo orden introducido.

package com.mycompany.guiaejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class GuiaEjercicio1 {

    public static void main(String[] args) {
    

        int[] numeros = new int[5];

        JOptionPane.showMessageDialog(null, "Ingrese 5 números: ");

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(input);
        }

        String mensaje = "Los números en el mismo orden introducido son: ";
        for (int i = 0; i < 5; i++) {
            mensaje += numeros[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);

           }
}


