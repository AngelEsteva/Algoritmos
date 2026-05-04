package com.angelesteva.estructurasecuencial;

import java.util.Scanner;

/*
Dado el valor de venta de un producto, se requiere calcular
el Impuesto General a las Ventas (IGV) correspondiente
al 19 %, así como determinar el precio final de venta.
 */
public class Ejercicio_3 {
    // Constante para el porcentaje de impuesto (19%)
    private static final double TASA_IMPUESTO = 0.19;

    /**
     * Método principal del programa.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Crear Scanner para leer datos desde teclado
        Scanner scanner = new Scanner(System.in);

        // Variable para almacenar el costo base del producto
        double costo;

        // Solicitar el costo al usuario
        System.out.print("Ingrese el costo del producto: ");
        costo = scanner.nextDouble();

        // Validar que el costo sea positivo
        if (costo < 0) {
            System.out.println("Error: El costo no puede ser negativo.");
        } else {
            // Calcular el impuesto
            double impuesto = calcularImpuesto(costo);

            // Calcular el precio final
            double precioFinal = costo + impuesto;

            // Mostrar resultado
            System.out.println("Precio final es: " + precioFinal);
        }

        // Cerrar recursos
        scanner.close();
    }

    /**
     * Calcula el impuesto a partir de un costo base.
     * @param costo valor del producto
     * @return impuesto calculado
     */
    private static double calcularImpuesto(double costo) {
        return costo * TASA_IMPUESTO;
    }
}
