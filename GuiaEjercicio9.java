/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiaejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class GuiaEjercicio9 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Introduce el número en la posición " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);
        }

        int ultimoEle = numeros[9];

        for (int i = 9; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimoEle;

        String resultado = "Array desplazado una posición hacia abajo:\n";
        for (int i = 0; i < 10; i++) {
            resultado += numeros[i] + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}