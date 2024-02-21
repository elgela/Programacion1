/*Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
vocal minúscula.*/

import java.io.*;

public class parte_5_ejercicio_3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        char caracter;

        try {
            System.out.println("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);
            while (caracter != '*') {
                if ((caracter >='1') && (caracter <='9')) {
                    System.out.println("Es caracter dígito");
                } 
                else if ((caracter >= 'a') && (caracter <= 'z')) {
                    switch (caracter) {
                        case 'a': case 'e': case 'i': case 'o': case 'u': {
                            System.out.println("Es vocal minúscula");
                            break;
                    }
                }
            }
            else{
                System.out.println("Es otro caracter");
            }
            System.out.println('\0');
            System.out.println("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);
        }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
