/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
con 2, 3, y 4.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Parte_3_Ejercicio_1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double numero;
        
        try {
            System.out.println("Ingrese número entero (0 para salir)");
            numero = Double.valueOf(entrada.readLine());
            System.out.println("\n");
        if(numero != 0){
            System.out.println("El cociente de la división por 2 es: " + numero/2);
            System.out.println("El cociente de la división por 3 es: " + numero/3);
            System.out.println("El cociente de la división por 4 es: " + numero/4);
        } else if(numero == 0){
            System.out.println("Terminado");
        }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
