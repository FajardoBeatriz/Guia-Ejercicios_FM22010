/*
 Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén
detrás.
 */

package com.mycompany.guiaejercicio8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        
        System.out.println("Ingrese 8 números:");
        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Array original:");
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.print("Ingrese una posición (0-9): ");
        int posicion = scanner.nextInt();
        
        if (posicion < 0 || posicion > 9) {
            System.out.println("La posición ingresada no es válida.");
        } else {
            for (int i = 7; i >= posicion; i--) {
                array[i + 1] = array[i];
            }
            array[posicion] = numero;
            
            System.out.println("Array modificado:");
            for (int i = 0; i < 9; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(array[9]);
        }
        
        scanner.close();
    }
}

    

