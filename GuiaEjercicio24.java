/*
Dado el siguiente array crear otro array donde guardara el array original sin los
números duplicados

```java
int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
```
 */

package com.mycompany.guiaejercicio24;

/**
 *
 * @author PC
 */
public class GuiaEjercicio24 {

    public static void main(String[] args) {

        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        
        int count = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < i; j++) {
                if (arrayOriginal[i] == arrayOriginal[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                count++;
            }
        }
        
        int[] arraySinDuplicados = new int[count];
        int index = 0;
        
        for (int i = 0; i < arrayOriginal.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < i; j++) {
                if (arrayOriginal[i] == arrayOriginal[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                arraySinDuplicados[index] = arrayOriginal[i];
                index++;
            }
        }
        
        for (int elemento : arraySinDuplicados) {
            System.out.print(elemento + " ");
        }
    }
}