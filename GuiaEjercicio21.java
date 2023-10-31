/*
Invertir orden de un array

ejemplo:
[1,2,3,4,5] array original
[5,4,3,2,1] array invertido
 */

package com.mycompany.guiaejercicio21;

/**
 *
 * @author PC
 */
public class GuiaEjercicio21 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] invertedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            invertedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.print("Array original: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Array invertido: ");
        for (int num : invertedArray) {
            System.out.print(num + " ");
        }
    }
}