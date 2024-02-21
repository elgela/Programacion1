/*Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.*/

import java.io.*;
public class parte_5_ejercicio_11 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        char caracter;
        final char MIN = 'a';
        final char MAX = 'z';
        final int NMIN = 1;
        final int NMAX = 10;

        try {
            System.out.println("Ingrese letra minúscula:");
            caracter = entrada.readLine().charAt(0);
            while ((caracter>=MIN)&&(caracter<=MAX)) {
                System.out.println("Ingrese número entero:");
                numero = Integer.valueOf(entrada.readLine());
                if ((numero>=NMIN)&&(numero<=5)) {
                    System.out.println("Tabla de multiplicar de " + numero);
                    for (int i = NMIN; i <= NMAX; i++) {
                        System.out.println(numero+"*"+i+" = "+numero*i);
                    }
                }
            }
            System.out.println("Ingrese letra minúscula:");
            caracter = entrada.readLine().charAt(0);

        } catch (Exception exc) {
            System.out.println(exc);
        }

    }
}
