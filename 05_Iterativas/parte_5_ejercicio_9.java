/*Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, se quede con la menor y la mayor letra ingresada. Finalmente
muestre por pantalla dichas letras.*/

import java.io.*;
public class parte_5_ejercicio_9 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        char caracter;
        char menor='0';
        char mayor='0';

        try {
            System.out.println("Ingrese letra minúscula:");
            caracter = entrada.readLine().charAt(0);
            while ((caracter>='a')&&(caracter<='z')) {
                if (menor=='0') {
                    menor=caracter;
                }
                if (caracter<menor) {
                    menor=caracter;
                }
                if (caracter>mayor) {
                    mayor=caracter;
                }
                System.out.println("Ingrese letra minúscula");
                caracter = entrada.readLine().charAt(0);
            }
            if (((mayor!=0)&&(menor!=0))) {
                System.out.println("El caracter mas grande es: " + mayor);
                System.out.println("El caracter mas chico es: " + menor);
            }else{
                System.out.println("No ingresó");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
