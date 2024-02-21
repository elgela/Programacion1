/*Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma.*/

import java.io.*;

public class parte_5_ejercicio_6 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = 10;
        final int MIN = 1;
        int numero;
        int suma=0;

        try {
            System.out.println("Ingrese un número entre 1 y 10///0 para finalizar");
            numero = Integer.valueOf(entrada.readLine());
            while ((numero>=MIN)&&(numero<=MAX)) {
                suma = suma + numero;
                System.out.println("Ingrese número entre 1 y 10///0 para finalizar");
                numero = Integer.valueOf(entrada.readLine());
            }
            System.out.println("El resultado de la suma es " + suma);

        } catch (Exception exc) {
            System.out.println("Error!");
        }
    }
}
