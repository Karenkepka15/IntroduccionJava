package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1=leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2=leer.nextInt();

        System.out.println("Ingrese el tercer numero");
        int num3=leer.nextInt();

        int promedio=(num1 + num2 + num3)/3;
        System.out.println(promedio);
    }
}
