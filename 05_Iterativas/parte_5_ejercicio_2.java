/*Escribir un programa que solicite al usuario el ingreso de un número entero
positivo, y muestre por pantalla los valores entre el numero ingresado y 0
de manera decreciente.*/

import java.io.*;

public class parte_5_ejercicio_2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        final int MIN = 0;

        try {
            System.out.println("Ingrese número positivo");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("\0");
            if (numero > MIN) {
                for (int i = numero; i >= MIN; i--) {
                    System.out.println(i);
                }
            }

        } catch (Exception exc) {
            System.out.println("Error!");
        }
    }
}
