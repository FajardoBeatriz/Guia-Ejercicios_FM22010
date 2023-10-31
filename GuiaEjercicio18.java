/*
Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la
diagonal principal sean 1 y el resto 0.

Ejemplo:

1 0 0 0 0 0 0
0 1 0 0 0 0 0
0 0 1 0 0 0 0
0 0 0 1 0 0 0
0 0 0 0 1 0 0
0 0 0 0 0 1 0
0 0 0 0 0 0 1
 */

package com.mycompany.guiaejercicio18;

/**
 *
 * @author PC
 */
public class GuiaEjercicio18 {

    public static void main(String[] args) {
        int tam = 7;
        int[][] matriz = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}