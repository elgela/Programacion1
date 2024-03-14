/*Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10 realice:
– Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracter
ingresado imprima a que tipo de carácter esta asociado:
• “letra minúscula” si el caracter es una letra del abecedario en minúscula;
• “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
• “dígito” si el caracter corresponde a un carácter número;
• “otro” para los restantes casos de caracteres.
– Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del numero
ingresado.*/

import java.io.*;

public class parte_6_ejercicio_11 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        char caracter;

        try {
            System.out.println("Ingrese un número entero entre 1 y 10");
            numero = Integer.valueOf(entrada.readLine());

            while ((numero >= MIN) && (numero <= MAX)) {
                if (numero % 3 == 0) {
                    System.out.println("Ingrese un carácter");
                    caracter = entrada.readLine().charAt(0);

                    tipo_caracter(caracter);
                    System.out.println('\0');

                    System.out.println("Ingrese un carácter");
                    caracter = entrada.readLine().charAt(0);

                } else if (numero % 5 == 0) {

                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void tipo_caracter(char caracter) {
        if ((caracter >= '1') && (caracter <= '9')) {
            System.out.println("Dígito");
            System.out.println('\0');
        } else if ((caracter >= 'a') && (caracter <= 'z')) {
            System.out.println("Letra minúscula");
            System.out.println('\0');
        } else if ((caracter >= 'A') && (caracter <= 'Z')) {
            System.out.println("Letra mayúscula");
            System.out.println('\0');
        } else {
            System.out.println("Otro");
            System.out.println('\0');
        }
    }
}
