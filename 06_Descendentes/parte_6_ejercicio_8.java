/*Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.*/

import java.io.*;
public class parte_6_ejercicio_8 {
    public static void main(String[] args) {
        final char CHARMIN='a';
        final char CHARMAX='z';
        final int NMIN=1;
        final int NMAX=5;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        char caracter;
        try {
            System.out.println("Ingrese letra minúscula:");
            caracter = entrada.readLine().charAt(0);

            while ((caracter>=CHARMIN)&&(caracter<=CHARMAX)) {
                System.out.println("Ingrese un número entero");
                numero = Integer.valueOf(entrada.readLine());
                
                if ((numero>=NMIN)&&(numero<=NMAX)) {
                    tabla_de_multiplicar(numero);
                }
                System.out.println("Ingrese letra minúscula:");
                caracter = entrada.readLine().charAt(0);    
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void tabla_de_multiplicar(int numero){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + numero + " = " + i*numero);
        }
    }
}
