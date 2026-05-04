package com.angelesteva.estructurasecuencial;

import java.util.Scanner;
/**
 * Clase que calcula la potencia de un número (base^exponente).
 */
public class Ejercicio_4 {

    /**
     * Método principal del programa.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Crear Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        int base;       // Número base
        int exponente;  // Exponente

        // Solicitar datos al usuario
        System.out.print("Ingrese la base: ");
        base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        exponente = scanner.nextInt();

        // Validación básica
        if (base == 0 && exponente == 0) {
            System.out.println("Error: 0^0 es una indeterminación.");
        } else {
            double resultado = calcularPotencia(base, exponente);
            System.out.println("El resultado es: " + resultado);
        }

        // Cerrar recursos
        scanner.close();
    }

    /**
     * Calcula la potencia de un número.
     * @param base número base
     * @param exponente exponente (puede ser positivo, negativo o cero)
     * @return resultado de la potencia
     */
    private static double calcularPotencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}