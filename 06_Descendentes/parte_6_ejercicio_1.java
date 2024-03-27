/*Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro numero y
lo imprima.*/

import java.io.*;
public class parte_6_ejercicio_1 {
    public static void main(String[] args) {
        
        int numero;
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese número distinto de 0");
            numero = Integer.valueOf(entrada.readLine());

            while (numero!=0) {
                System.out.println("Ingrese otro número");
                numero = Integer.valueOf(entrada.readLine());
                System.out.println("El número fue " + numero);
                System.out.println('\0');
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
