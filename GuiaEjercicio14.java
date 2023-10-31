/*
Dado el siguiente array ordenar en orden ascendente y descendente utilizando dos
métodos de ordenamiento puede usar el que desee.
int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98,
45};
 */

package com.mycompany.guiaejercicio14;

/**
 *
 * @author PC
 */
public class GuiaEjercicio14 {

   public static void selectionSortDesc(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        int maxIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}

public static void selectionSortAsc(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

public static void main(String[] args) {
    int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98, 45};

    selectionSortDesc(numerosDesordenados);

    System.out.println("Orden descendente:");
    for (int num : numerosDesordenados) {
        System.out.print(num + " ");
    }

    selectionSortAsc(numerosDesordenados);

    System.out.println("\nOrden ascendente:");
    for (int num : numerosDesordenados) {
        System.out.print(num + " ");
    }
}
}