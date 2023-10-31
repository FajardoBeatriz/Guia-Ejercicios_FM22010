/*
Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
Éstos los guardaremos en un array de tamaño 10.
Leer un número N, e insertarlo en el lugar adecuado para que el array continúe ordenado.
 */

package com.mycompany.guiaejercicio10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int[] arreglo = new int[10];
        
        System.out.println("Escribe 5 elementos numéricos ordenados de forma creciente:");
        for (int var = 0; var < 5; var++) {
            arreglo[var] = sc.nextInt();
        }
        
        System.out.print("Escribe el número N a agregar: ");
        int n = sc.nextInt();
        
        int ubicacion = 0;
        while (ubicacion < 5 && arreglo[ubicacion] < n) {
            ubicacion++;
        }
        
        for (int var = 4; var >= ubicacion; var--) {
            arreglo[var + 1] = arreglo[var];
        }
        
        arreglo[ubicacion] = n;
        
        System.out.println("Arreglo (array) después de la integración:");
        for (int var = 0; var < 6; var++) {
            System.out.print(arreglo[var] + " ");
        }
        
        sc.close();
    }
}       