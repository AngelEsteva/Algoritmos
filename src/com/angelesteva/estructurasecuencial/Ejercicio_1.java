package com.angelesteva.estructurasecuencial;

import java.util.Scanner;

/*
Dados dos números enteros, se requiere calcular la suma de ambos.
 */
public class Ejercicio_1 {
    static void main() {
        int num1, num2, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numero: ");
        num2 = sc.nextInt();
        suma = num1 + num2;
        IO.println("Total = " + suma);
        System.out.println("Total = " + suma);
        sc.close();
    }
}
