/*Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima.*/

import java.io.*;
public class parte_5_ejercicio_4 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero;

        try {
            System.out.println("Ingrese un número entero: /// 0 para terminar");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("\0");

            while (numero!=0) {
                System.out.println("El número ingresado es: " + numero);
                System.out.println("\0");

                System.out.println("Ingrese otro número entero");
                numero = Integer.valueOf(entrada.readLine());
            }

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
