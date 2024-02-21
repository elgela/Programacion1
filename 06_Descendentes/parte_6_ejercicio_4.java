/*Escribir un programa que mientras el usuario cargue desde
teclado un numero entero distinto de 0, imprima por
pantalla la suma que se obtiene de invocar un método
que calcula la sumatoria de los primeros 200 números
naturales (son números enteros en 1 y 200).*/

import java.io.*;
public class parte_6_ejercicio_4 {
    public static final int MIN=1;
    public static final int MAX=200;
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            int suma;
        try {
            System.out.println("Ingrese un número distinto de 0");
            numero = Integer.valueOf(entrada.readLine());

            while (numero!=0) {
                suma = suma_de_200_numeros();
                System.out.println(suma);
    
                System.out.println("Ingrese número distinto de 0 // 0 para finalizar");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static int suma_de_200_numeros() {
        System.out.println("Suma de primeros 200 números enteros");
        int suma=0;
        for (int i = MIN; i <= MAX; i++) {
            suma = ((i*(i+MIN))/2);
        }
        return suma;
    }
}
