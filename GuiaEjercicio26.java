/*
Utilizando dos estructuras de datos (array) unidimensional cree un programa que
permita gestionar la asignación de asientos en un microbús con una distribución de filas
y asientos en dos lados, izquierdo y derecho. Los asientos pueden ser vendidos y
devueltos, y el programa debe llevar un registro de las ventas totales.
Los arrays deben ser del tipo int el valor por defecto (cuando estan disponibles) sera
de -1 cuando sea vendido pasara a tener el valor 1
El programa debe solicitar al usuario la cantidad de filas para el microbús, que debe
estar entre 6 y 10 filas.
1. Menú de Opciones:
El programa debe ofrecer un menú con las siguientes opciones:
1. Ver Distribución: Mostrar la distribución actual de asientos en el microbús
(lado izquierdo y derecho).
2. Vender Asientos:
Permitir al usuario seleccionar el lado (izquierdo o derecho) y la
cantidad de asientos a vender (1 o 2).
Validar disponibilidad de asientos Mostrar mensajes adecuados si los
asientos seleccionados ya están ocupados.
Para que el usuario compre uno o dos asientos se debe mostrar la
distribucion de asientos del lado que previamente selecciono
Marcar los asientos seleccionados como vendidos, si están
disponibles, y actualizar el total de ventas.
3. Devolver Asientos: Permitir al usuario devolver asientos previamente
vendidos. Se debe preguntar cual era su asiento y si este esta ocupado de
sebe marcar como disponible nuevamente Recordar actualizar el total de
ventas.
4. Mostrar la Caja: Mostrar el total de ventas acumulado hasta el momento.
5. Salir: Finalizar el programa.
2. Manejo de Errores:
Validar las entradas del usuario en todas las etapas del programa para
garantizar datos válidos y proporcionar mensajes de error claros cuando sea
necesario.
 */

package com.mycompany.guiaejercicio26;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class GuiaEjercicio26 {
    static int[] izquierdo;
    static int[] derecho;
    static int filas;
    static int opcionMenu;
    static int numeroAsientos;
    static boolean vendido = false;
    static int lado;
    static int asientos = 0;
    static double caja = 0.0;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese la cantidad de filas (6-10): ");
            filas = scanner.nextInt();
        } while (filas < 6 || filas > 10);

        izquierdo = new int[filas];
        derecho = new int[filas];

        Arrays.fill(izquierdo, -1);
        Arrays.fill(derecho, -1);

        do {
            menu();
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    mostrarDistribucion(izquierdo, derecho);
                    break;
                case 2:
                    if (disponibilidad(izquierdo) || disponibilidad(derecho)) {
                        do {
                            System.out.println("Ingrese el lado del asiento (1. Izquierdo, 2. Derecho)");
                            lado = scanner.nextInt();
                        } while (lado < 1 || lado > 2);

                        if (lado == 1) {
                         compra(izquierdo,"izquierdo");
                        }else {
                            compra(derecho,"derecha4");
                        }

                    } else {
                        System.out.println("No hay asientos dispònibles");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("La caja tiene: $" + caja);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no valida");

            }
        } while (opcionMenu != 5);
    }


    static void compra(int[] vector,String lado) {

        Arrays returns;
        Scanner scanner = new Scanner(System.in);
        int asientos;
        boolean vendido = false;
        do {
            System.out.println("Cuantos asientos desea comprar? 1. un asiento, 2. dos asientos");
            asientos = scanner.nextInt();
        } while (asientos < 1 || asientos > 2);

        if (disponibilidad(vector, asientos)) {
            if (asientos == 1) {
                mostrarLado(vector, lado);

                int numeroAsientos;
                do {
                    System.out.println("Ingrese el número del asiento que desea comprar");
                    numeroAsientos = scanner.nextInt();
                } while (numeroAsientos < 1 || numeroAsientos > filas);

                vendido = venderAsiento(vector, numeroAsientos);

                if (vendido) {
                    System.out.println("Asiento Vendido");
                    caja += 0.35;
                } else {
                    System.out.println("El asiento ya esta ocupado");
                }

            } else {
                int primerAsiento;
                int segundoAsiento;

                mostrarLado(vector, "izquierdo");

                do {
                    System.out.println("Ingrese el número del primer asiento que desea comprar");
                    primerAsiento = scanner.nextInt();
                } while (primerAsiento < 1 || primerAsiento > filas);

                do {
                    System.out.println("Ingrese el número del segundo asiento que desea comprar");
                    segundoAsiento = scanner.nextInt();
                } while (segundoAsiento < 1 || segundoAsiento > filas);

                if (venderAsiento(vector, primerAsiento) && venderAsiento(vector, segundoAsiento)) {
                    System.out.println("Asientos vendidos");
                    caja += 0.50;
                } else {
                    System.out.println("Uno o ambos asientos ya estan ocupados");
                }
            }
        } else {
            System.out.println("No hay cantidad de asientos disponibles");
        }

    }


    static void mostrarLado(int[] arr, String lado) {
        System.out.println("Asientos del lado: " + lado);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Asiento[%d]=%d%n", i + 1, arr[i]);
        }
    }

    static boolean disponibilidad(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                return true;
            }
        }
        return false;
    }

    static boolean disponibilidad(int[] arr, int cantidad) {
        int contador = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                contador++;
            }
        }
        return contador >= cantidad;
    }

    static void mostrarDistribucion(int[] izquierdo, int[] derecho) {
        System.out.println("IZQUIERDO" + "\t" + "DERECHO");
        for (int i = 0; i < izquierdo.length; i++) {
            System.out.printf("Asiento[%d]=%d | Asiento[%d]=%d%n", i + 1, izquierdo[i], i + 1, derecho[i]);
        }
    }

    static void menu() {
        System.out.println("\nMENU");
        System.out.println("1. Ver Distribución de Asientos:");
        System.out.println("2. Vender Asiento:");
        System.out.println("3. Devolver Asiento:");
        System.out.println("4. Caja:");
        System.out.println("5. Salir");
        System.out.println("======================================");
    }

    static boolean venderAsiento(int[] arr, int posicion) {
        if (arr[posicion - 1] == -1) {
            arr[posicion - 1] = 1;
            return true;
        }
        return false;
    }
    }
