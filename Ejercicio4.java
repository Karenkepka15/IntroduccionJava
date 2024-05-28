package org.example;

public class Ejercicio4 {
    public static void main(String[] args) {
        int x[] = {10, 26, 30, 11, 34, 78, 10, 22, 34};
        boolean encontrado = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 10 || x[i] == 30) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("si hay numeros entre el 10 y el 30");
        } else {
            System.out.println("no hay numeros entre el 10 y el 30");
        }
    }
}

