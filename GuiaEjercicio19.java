/*
Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se
obtiene la misma tabla al cambiar las filas por columnas.
 */

package com.mycompany.guiaejercicio19;

/**
 *
 * @author PC
 */
public class GuiaEjercicio19 {

    public static void main(String[] args) {
        int[][] tabla = {
            {1, 2, 3, 4},
            {2, 5, 6, 7},
            {3, 6, 8, 9},
            {4, 7, 9, 10}
        };

        boolean esSimetrica = true;

        int filas = tabla.length;
        int columnas = tabla[0].length;

        if (filas != columnas) {
            esSimetrica = false;
        } else {

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (tabla[i][j] != tabla[j][i]) {
                        esSimetrica = false;
                        break;
                    }
                }
                if (!esSimetrica) {
                    break;
                }
            }
        }

        if (esSimetrica) {
            System.out.println("La tabla es simétrica.");
        } else {
            System.out.println("La tabla no es simétrica.");
        }
    }
}