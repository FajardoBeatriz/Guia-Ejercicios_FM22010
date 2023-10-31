/*
Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo
los de los bordes que deben ser 1. Mostrarla.

Ejemplo:

1 1 1 1 1 1
1 0 0 0 0 1
1 0 0 0 0 1
1 0 0 0 0 1
1 0 0 0 0 1
1 0 0 0 0 1
1 0 0 0 0 1
1 1 1 1 1 1
 */

package com.mycompany.guiaejercicio22;

/**
 *
 * @author PC
 */
public class GuiaEjercicio22 {

    public static void main(String[] args) {
        int filas = 8;
        int columnas = 6;
        
        int[][] matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}