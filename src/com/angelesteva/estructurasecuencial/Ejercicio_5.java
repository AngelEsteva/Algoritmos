package com.angelesteva.estructurasecuencial;
import java.util.Scanner;

/**
 * Clase que calcula la raíz n-ésima de un número (radicación).
 */
public class Ejercicio_5 {

    /**
     * Método principal del programa.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Crear Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        int radicando; // Número al que se le aplicará la raíz
        int indice;    // Índice de la raíz (n)

        // Solicitar datos al usuario
        System.out.print("Ingrese el radicando: ");
        radicando = scanner.nextInt();

        System.out.print("Ingrese el índice de la raíz: ");
        indice = scanner.nextInt();

        // Validaciones
        if (indice == 0) {
            System.out.println("Error: El índice no puede ser 0.");
        } else if (radicando < 0 && indice % 2 == 0) {
            // Raíz par de número negativo no es real
            System.out.println("Error: No se puede calcular una raíz par de un número negativo.");
        } else {
            // Cálculo de la raíz n-ésima usando potencia
            double resultado = calcularRaiz(radicando, indice);

            // Mostrar resultado
            System.out.println("El resultado es: " + resultado);
        }

        // Cerrar recursos
        scanner.close();
    }

    /**
     * Calcula la raíz n-ésima de un número.
     * @param radicando número base
     * @param indice índice de la raíz
     * @return resultado de la radicación
     */
    private static double calcularRaiz(int radicando, int indice) {
        return Math.pow(radicando, 1.0 / indice);
    }
}