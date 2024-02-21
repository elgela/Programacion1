/*Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados deberían
ser constantes?. De a poco habría que definirlos como constantes).*/

import java.io.*;

public class parte_5_ejercicio_1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = 10;
        final int MIN = 1;
        int numero;

        try {
            System.out.println("Ingrese un número mayor a 1 y menor 10");
            numero = Integer.valueOf(entrada.readLine());
            while ((numero < MAX) && (numero > MIN)) {
                if ((numero %2 == 0) && (numero %3 == 0)) {
                    System.out.println("El número es múltiplo de 2 y de 3");
                }
                System.out.println("\0");
                System.out.println("Ingrese un número mayor a 1 y menor a 10");
                numero = Integer.valueOf(entrada.readLine());
            } 


        } catch (Exception exc) {
            System.out.println("Error!");
        }
    }
}
