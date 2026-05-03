package com.angelesteva.estructurasecuencial;

import java.util.Scanner;

/*
Dado el valor de venta de un producto, se requiere calcular
el Impuesto General a las Ventas (IGV) correspondiente
al 19 %, así como determinar el precio final de venta.
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        double costo, impuesto, precioFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el costo: ");
        costo = sc.nextDouble();
        impuesto = costo * 0.19;
        precioFinal = costo + impuesto;
        System.out.println("Precio final es: " + precioFinal);
        sc.close();
    }
}
