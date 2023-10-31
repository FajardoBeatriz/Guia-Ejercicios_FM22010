/*
 Leer 5 números por teclado y a continuación realizar la media de los números
positivos, la media de los negativos y contar el número de ceros.
 */

package com.mycompany.guiaejercicio2;

import javax.swing.JOptionPane;


public class GuiaEjercicio2 {

    public static void main(String[] args) {
        int n = 5;
        int[] numeros = new int[n];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorCeros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(input);
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular la media de los números positivos y negativos
        double mediaPositivos = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;
        double mediaNegativos = (contadorNegativos > 0) ? (double) sumaNegativos / contadorNegativos : 0;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,"Media de los números positivos: " + mediaPositivos);
        JOptionPane.showMessageDialog(null,"Media de los números negativos: " + mediaNegativos);
        JOptionPane.showMessageDialog(null,"Número de ceros: " + contadorCeros);
    }
}


