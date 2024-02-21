/*Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado
imprima:
– “letra minúscula” si el caracter es una letra del abecedario en minúscula;
– “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
– “dígito” si el caracter corresponde a un carácter número;
– “otro” para los restantes casos de caracteres.*/

import java.io.*;
public class parte_6_ejercicio_10 {
    public static final int MIN = 1;
    public static final int MAX = 10;
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        char caracter;

        try {
            System.out.println("Ingrese número entero");
            numero = Integer.valueOf(entrada.readLine());

            while ((numero>MIN)&&(numero<MAX)) {
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);

                    tipo_de_caracter(caracter);


                System.out.println("Ingrese número entero");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void tipo_de_caracter(char caracter){
        if ((caracter>='a')&&(caracter<='z')) {
            System.out.println("Letra minúscula");
            System.out.println('\0');
        }
        else if ((caracter>='A')&&(caracter<='Z')) {
            System.out.println("Letra mayúscula");
            System.out.println('\0');
        }
        else if ((caracter>='0')&&(caracter<='9')) {
            System.out.println("Dígito");
            System.out.println('\0');
        } 
        else{
            System.out.println("Otro");
            System.out.println('\0');
        }
    }
}
