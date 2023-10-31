/*
Realice un programa que verifique si una contraseña cumple con los siguientes
requisitos:
Tiene al menos 8 caracteres de longitud.
Contiene al menos 1 letra mayúscula.
Contiene al menos 1 letra minúscula.
Contiene al menos 1 dígito.
Contiene al menos 1 símbolo.

char p[] = "Ax5@abcdefg";
 */

package com.mycompany.guiaejercicio25;

/**
 *
 * @author PC
 */
public class GuiaEjercicio25 {

    public static void main(String[] args) {
        String contraseña = "Ax5@abcdefg";

        if (verificarContraseña(contraseña)) {
            System.out.println("La contraseña "+ contraseña + " cumple con los requisitos.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }

    public static boolean verificarContraseña(String contraseña) {
        if (contraseña.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            } else if (esSimbolo(caracter)) {
                tieneSimbolo = true;
            }
        }

        return tieneMayuscula && tieneMinuscula && tieneDigito && tieneSimbolo;
    }

    public static boolean esSimbolo(char caracter) {
        String simbolos = "@#$%^&+=!";
        return simbolos.indexOf(caracter) != -1;
    }
        }