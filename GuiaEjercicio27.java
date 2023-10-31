/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiaejercicio27;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio27 {

    public char[][] tablero;
    public char jugadorActual;
    public boolean juegoTerminado;

    public GuiaEjercicio27() {
       tablero = new char[3][3];
        jugadorActual = 'X';
        juegoTerminado = false;
        inicializarTablero();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (!juegoTerminado) {
            mostrarTablero();
            System.out.println("Es el turno del jugador " + jugadorActual);
            int fila, columna;

            do {
                System.out.print("Ingresa la fila (0, 1, o 2): ");
                fila = scanner.nextInt();
                System.out.print("Ingresa la columna (0, 1, o 2): ");
                columna = scanner.nextInt();
            } while (!esMovimientoValido(fila, columna));

            realizarMovimiento(fila, columna);
            cambiarJugador();
            juegoTerminado = verificarGanador() || tableroLleno();
        }

        mostrarTablero();
        if (verificarGanador()) {
            System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
        } else {
            System.out.println("¡El juego ha terminado en empate!");
        }
    }

    public void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void mostrarTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    public boolean esMovimientoValido(int fila, int columna) {
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            System.out.println("Coordenadas fuera de rango. Inténtalo de nuevo.");
            return false;
        }
        if (tablero[fila][columna] != ' ') {
            System.out.println("Casilla ocupada. Inténtalo de nuevo.");
            return false;
        }
        return true;
    }

    public void realizarMovimiento(int fila, int columna) {
        tablero[fila][columna] = jugadorActual;
    }

    public boolean verificarGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true; // Línea horizontal
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true; // Línea vertical
            }
        }
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true; // Diagonal principal
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true; // Diagonal secundaria
        }
        return false;
    }

    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    public static void main(String[] args) {
        GuiaEjercicio27 juego = new GuiaEjercicio27();
        juego.jugar();
    }
}
