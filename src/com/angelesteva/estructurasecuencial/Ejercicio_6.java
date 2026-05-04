package com.angelesteva.estructurasecuencial;
import java.util.Scanner;

/**
 * Clase que invierte los dígitos de un número entero.
 * Ejemplo: 1234 -> 4321
 */
public class Ejercicio_6 {

    /**
     * Método principal del programa.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Crear Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar número al usuario
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Calcular número invertido
        int resultado = invertirNumero(numero);

        // Mostrar resultado
        System.out.println("Número invertido: " + resultado);

        // Cerrar recursos
        scanner.close();
    }

    /**
     * Invierte los dígitos de un número entero.
     * @param numero número a invertir
     * @return número con los dígitos invertidos
     */
    private static int invertirNumero(int numero) {

        int invertido = 0;
        int signo = numero < 0 ? -1 : 1;

        // Trabajar con valor absoluto para simplificar
        numero = Math.abs(numero);

        while (numero != 0) {
            int digito = numero % 10;              // Obtener último dígito
            invertido = invertido * 10 + digito;   // Construir número invertido
            numero = numero / 10;                  // Eliminar último dígito
        }

        return invertido * signo; // Restaurar signo original
    }
}