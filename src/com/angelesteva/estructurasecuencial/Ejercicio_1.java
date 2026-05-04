package com.angelesteva.estructurasecuencial;
import java.util.Scanner;

/**
 * Clase que solicita dos números al usuario,
 * los suma y muestra el resultado en consola.
 */
public class Ejercicio_1 {

    /**
     * Método principal de ejecución del programa.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos desde teclado
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        int numero1;
        int numero2;
        int resultado;

        // Solicitar primer número al usuario
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();

        // Solicitar segundo número al usuario
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();

        // Realizar la suma
        resultado = numero1 + numero2;

        // Mostrar el resultado en consola
        System.out.println("Total = " + resultado);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
