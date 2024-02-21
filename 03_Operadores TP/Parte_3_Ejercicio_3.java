/*Escribir un programa que permita el ingreso de dos números enteros por teclado e imprima el resultado de comparar:
_ el primero mayor al segundo.
_ ambos son múltiplos de 2.*/

import java.io.*;

public class Parte_3_Ejercicio_3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero1, numero2;
        boolean resultado;

        try {
            System.out.println("Ingrese número");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese número");
            numero2 = Integer.valueOf(entrada.readLine());           
            resultado = numero1 > numero2;
            System.out.println("\n");
            System.out.println("¿El primer número es mayor al segundo? \n" + resultado);
            resultado = ((numero1 %2 == 0)&&(numero2 %2 == 0));
            System.out.println("¿Ambos números son múltiplos de 2? \n" + resultado);

        } catch (Exception exc) {
            System.out.println("¡Error!");
        }
    }
}
