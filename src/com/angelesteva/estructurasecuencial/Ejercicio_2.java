package com.angelesteva.estructurasecuencial;

import java.util.Scanner;

/*
Dados dos números enteros, se requiere determinar el cociente y el residuo resultantes de su división.
 */
public class Ejercicio_2 {
    static void main() {
        int num1, num2, cociente, residuo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numero: ");
        num2 = sc.nextInt();
        cociente = num1 / num2;
        residuo = num1 % num2;
        System.out.println("residuo = " + residuo);
        System.out.println("cociente = " + cociente);
        sc.close();
    }
}
