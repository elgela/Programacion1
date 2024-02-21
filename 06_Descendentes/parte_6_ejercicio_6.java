/*Escribir un programa que mientras que el usuario ingrese un número entero
natural, llame a un método que calcule la sumatoria entre 1 y dicho
numero y se lo retorne como resultado.*/

import java.io.*;
public class parte_6_ejercicio_6 {
    public static final int MIN=1;
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero, suma;

        try {
            System.out.println("Ingrese un número entero natural");
            numero = Integer.valueOf(entrada.readLine());

            while (numero>0) {
                suma = sumatoria_con_1(numero);
                System.out.println(suma);

                System.out.println("Ingrese un número entero natural");
                numero = Integer.valueOf(entrada.readLine());    
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static int sumatoria_con_1(int numero){
        int suma=0;

        for (int i = 1; i <= numero; i++) {
            suma=(i+MIN);
        }
        return suma;
    }
}

