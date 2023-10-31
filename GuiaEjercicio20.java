/*
Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */

package com.mycompany.guiaejercicio20;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        System.out.println("Ingrese los valores para la primera matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los valores para la segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizResultado = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz Resultado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}