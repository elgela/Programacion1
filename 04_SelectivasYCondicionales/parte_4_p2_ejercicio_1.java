/*Hacer un programa que solicite la carga desde consola de un número entero y realice:
_si el numero es positivo, imprima "grande" si es mayor a 100 o "chico" si es menor. Además deberá imprimir que el valor es positivo.
_si no lo es, imprima si el número es par, o si el numero es múltiplo de 3, o ninguna de las opciones anteriores.*/

import java.io.*;

public class parte_4_p2_ejercicio_1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero;

        try {
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("\t");
            if ((numero > 0)&&(numero > 100)) {
                System.out.println("Grande");
                System.out.println("Valor positivo");
            } else if((numero > 0)&&(numero < 100)) {
                System.out.println("Chico");
                System.out.println("Valor positivo");
            }
            else {
                if (numero %2 == 0) {
                    System.out.println("Es número par");
                } else if(numero %3 == 0) {
                    System.out.println("Es múltiplo de 3");
                }
                else{
                    System.out.println("Ninguna de las opciones");
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }
}