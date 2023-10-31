/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiaejercicio28;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GuiaEjercicio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de Datos Inicial
        int numEstudiantes = 0;
        int numPeriodos = 0;

        do {
            System.out.print("Ingrese la cantidad de estudiantes (entre 1 y 10): ");
            numEstudiantes = scanner.nextInt();
        } while (numEstudiantes < 1 || numEstudiantes > 10);

        do {
            System.out.print("Ingrese la cantidad de períodos académicos (entre 3 y 5): ");
            numPeriodos = scanner.nextInt();
        } while (numPeriodos < 3 || numPeriodos > 5);

        // Crear matriz para almacenar calificaciones
        double[][] calificaciones = new double[numEstudiantes][numPeriodos];

        int opcion;

        do {
            // Menú de opciones
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Ingresar calificaciones por período.");
            System.out.println("2. Ingresar calificaciones por estudiante.");
            System.out.println("3. Ver calificaciones.");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Ingreso de Calificaciones por Período
                    ingresarCalificacionesPorPeriodo(calificaciones, numEstudiantes, numPeriodos, scanner);
                    break;
                case 2:
                    // Ingreso de Calificaciones por Estudiante
                    ingresarCalificacionesPorEstudiante(calificaciones, numEstudiantes, numPeriodos, scanner);
                    break;
                case 3:
                    // Ver Calificaciones
                    verCalificaciones(calificaciones);
                    break;
                case 4:
                    // Salir
                    System.out.println("Ha salido del sistema");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void ingresarCalificacionesPorPeriodo(double[][] calificaciones, int numEstudiantes, int numPeriodos, Scanner scanner) {
        int periodo;
        do {
            System.out.print("Ingrese el número de período (entre 1 y " + numPeriodos + "): ");
            periodo = scanner.nextInt();
        } while (periodo < 1 || periodo > numPeriodos);

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " para el período " + periodo + ": ");
            double calificacion = scanner.nextDouble();

            while (calificacion < 0 || calificacion > 10) {
                System.out.println("La calificación debe estar en el rango de 0 a 10.");
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " para el período " + periodo + ": ");
                calificacion = scanner.nextDouble();
            }

            calificaciones[i][periodo - 1] = calificacion;
        }
        System.out.println("Calificaciones ingresadas correctamente.");
    }

    public static void ingresarCalificacionesPorEstudiante(double[][] calificaciones, int numEstudiantes, int numPeriodos, Scanner scanner) {
        int estudiante;
        do {
            System.out.print("Ingrese el número de estudiante (entre 1 y " + numEstudiantes + "): ");
            estudiante = scanner.nextInt();
        } while (estudiante < 1 || estudiante > numEstudiantes);

        int periodo;
        do {
            System.out.print("Ingrese el número de período (entre 1 y " + numPeriodos + "): ");
            periodo = scanner.nextInt();
        } while (periodo < 1 || periodo > numPeriodos);

        System.out.print("Ingrese la calificación del estudiante " + estudiante + " para el período " + periodo + ": ");
        double calificacion = scanner.nextDouble();

        while (calificacion < 0 || calificacion > 10) {
            System.out.println("La calificación debe estar en el rango de 0 a 10.");
            System.out.print("Ingrese la calificación del estudiante " + estudiante + " para el período " + periodo + ": ");
            calificacion = scanner.nextDouble();
        }

        calificaciones[estudiante - 1][periodo - 1] = calificacion;
        System.out.println("Calificación ingresada correctamente.");
    }

    public static void verCalificaciones(double[][] calificaciones) {
        System.out.println("Calificaciones por estudiante y período:");
        System.out.print("Estudiante\t");
        for (int i = 1; i <= calificaciones[0].length; i++) {
            System.out.print("Período " + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + "\t");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}

