/*Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados y la cantidad
de sumas que realizó. Finalmente, cuando sale del ciclo muestre por
pantalla el resultado del promedio de todo lo ingresado.*/

import java.io.*;
public class parte_5_ejercicio_7 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = 10;
        final int MIN = 1;
        int suma=0, cantSumas=0, numero;

        try {
            System.out.println("Ingrese número entre 1 y 10//0 para finalizar");
            numero = Integer.valueOf(entrada.readLine());
            while ((numero>=MIN)&&(numero<=MAX)) {
                cantSumas++;
                suma=suma+numero;
                System.out.println("Ingrese número entre 1 y 10//0 para finalizar");
                numero = Integer.valueOf(entrada.readLine());
            }
            System.out.println("La suma total de los números ingresados es: " + suma);
            System.out.println("La cantidad de sumas realizadas fueron: " + cantSumas);
            System.out.println("El resultado promedio es: " + suma/cantSumas);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
