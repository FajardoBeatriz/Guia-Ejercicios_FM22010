/*
Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
Ejemplo:

Matriz Original:
1 2 3
4 5 6
7 8 9

Matriz Transpuesta:
1 4 7
2 5 8
3 6 9
 */

package com.mycompany.guiaejercicio17;

/**
 *
 * @author PC
 */
public class GuiaEjercicio17 {

    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz Original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}