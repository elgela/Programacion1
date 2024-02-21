/*Hacer un programa que solicite la carga desde consola de un carácter y realice: imprima si es dígito, o letra minúscula, o es cualquier otro carácter. Si es letra minúscula indicar si es vocal o consonante.*/

import java.io.*;

public class parte_4_p2_ejercicio_2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        char caracter;

        try {
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);

            if ((caracter >= '1') && (caracter <= '9')) {
                System.out.println("El caracter ingresado es un dígito");
            }
            else if ((caracter >= 'a') && (caracter <= 'z')) {
                switch (caracter) {
                    case 'a': case 'e': case 'i': case 'o': case 'u': {
                        System.out.println("El caracter ingresado es una vocal minúscula");
                        break;
                    }
                
                    default: {
                        System.out.println("El caracter ingresado es una consonante minúscula");
                }
            }
        }
        else {
            System.out.println("El caracter ingresado es otra cosa");
        }

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
