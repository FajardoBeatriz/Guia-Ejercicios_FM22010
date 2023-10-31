/*
 Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente,
decreciente, o si están desordenados. Los posibles valores para creciente y decreciente son:Si, para algún índice i , se cumple que 
t[i] > t[i+1] , la serie t[i],t[i+1] se considera decreciente. De lo contrario, se considera creciente.
 */

package com.mycompany.guiaejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class GuiaEjercicio7 {

    public static void main(String[] args) {
         int[] numeros = new int[10];

        JOptionPane.showMessageDialog(null, "Ingrese 10 números: ");

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(input);
        }
        
        boolean creciente=true;
        boolean decreciente=true;
        
        for(int i=0; i<9; i++){
            if(numeros[i]>numeros[i+1]){
                creciente=false;
            }else if(numeros[i]<numeros[i+1]){
                decreciente=false;
            }
        }
        
        if (creciente && decreciente) {
            JOptionPane.showMessageDialog(null,"La serie está desordenada.");
        } else if (creciente) {
            JOptionPane.showMessageDialog(null,"La serie está ordenada de forma creciente.");
        } else if (decreciente) {
            JOptionPane.showMessageDialog(null,"La serie está ordenada de forma decreciente.");
        } else {
            JOptionPane.showMessageDialog(null,"Todos los números son idénticos.");
        }
    }
}
