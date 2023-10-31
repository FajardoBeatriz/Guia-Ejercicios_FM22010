/*
 Leer por teclado un array de 10 elementos numéricos enteros y una posición (entre
0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
 */

package com.mycompany.guiaejercicio11;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       //Arreglo
        int[] arreglo = new int[10];
        
        System.out.println("Escribe 10 numeros enteros:");
        for (int var = 0; var < 10; var++) {
            arreglo[var] = sc.nextInt();
        }
    
        System.out.print("Escribe la posición a quitar del 0 y 9: ");
        int ubicacion = sc.nextInt();
        
        if (ubicacion < 0 || ubicacion >= 10) {
            System.out.println("Está fuera del rango establecido.");
        } else {
     
            for (int var = ubicacion; var < 9; var++) {
                arreglo[var] = arreglo[var + 1];
            }
            arreglo[9] = 0; 

            System.out.println("Arreglo (array) después de la integración:");
            for (int var = 0; var < 9; var++) {
                System.out.print(arreglo[var] + " ");
            }
        }
        
        sc.close();
    }
}
