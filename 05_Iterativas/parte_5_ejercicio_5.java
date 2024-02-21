/*Escribir un programa que mientras que el usuario ingrese un caracter dígito
o caracter letra minúscula, imprima si es caracter dígito o caracter letra
minúscula, y si es letra minúscula imprimir si es vocal o consonante.*/

import java.io.*;
public class parte_5_ejercicio_5 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        char caracter;

        try {
            System.out.println("Ingrese número o letra minúscula:");
            caracter = entrada.readLine().charAt(0);

            while (((caracter>='a')&&(caracter<='z'))||((caracter>='1')&&(caracter<='9'))) {
                if ((caracter>='1')&&(caracter<='9')) {
                    System.out.println("El caracter es dígito");
                    System.out.println("\0");
                }
                else if ((caracter>='a')&&(caracter<='z')) {
                    switch (caracter) {
                        case 'a': case 'e': case 'i': case 'o': case 'u':
                            System.out.println("Es una vocal");
                            System.out.println("\0");

                            break;
                    
                        default: {
                            System.out.println("Es una consonante");
                            System.out.println("\0");

                        }
                            
                    }
                }
                System.out.println("Ingrese número o letra minúscula:");
                caracter = entrada.readLine().charAt(0);
                }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
