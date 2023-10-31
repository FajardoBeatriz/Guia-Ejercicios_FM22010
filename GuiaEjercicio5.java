/*
 Crea un programa que encuentre el valor máximo y mínimo en un array de números
enteros. se debe llenar el array con números ingresados por el usuario.
 */

package com.mycompany.guiaejercicio5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class GuiaEjercicio5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int array = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del array: "));

        int[] numeros = new int[array];

        for (int i = 0; i < array; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número en la posición " + (i + 1) + ": "));
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < array; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null,"El valor máximo en el array es: " + maximo);
        JOptionPane.showMessageDialog(null,"El valor mínimo en el array es: " + minimo);

        scanner.close();
    }
}