package com.angelesteva.estructurasecuencial;

import java.util.Scanner;

/*
Dados dos números enteros, se requiere determinar el cociente y el residuo resultantes de su división.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {

        // Crear Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        int dividendo;
        int divisor;
        int cociente;
        int residuo;

        // Solicitar el dividendo
        System.out.print("Ingrese el dividendo: ");
        dividendo = scanner.nextInt();

        // Solicitar el divisor
        System.out.print("Ingrese el divisor: ");
        divisor = scanner.nextInt();

        // Validar que el divisor no sea cero
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            // Calcular cociente (división entera)
            cociente = dividendo / divisor;

            // Calcular residuo (módulo)
            residuo = dividendo % divisor;

            // Mostrar resultados
            System.out.println("Cociente = " + cociente);
            System.out.println("Residuo = " + residuo);
        }

        // Cerrar recursos
        scanner.close();
    }
}
