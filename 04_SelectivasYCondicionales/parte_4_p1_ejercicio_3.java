/*Escribir un programa que ingrese un número entero por teclado y realice:
_ imprima es múltiplo de 6 y de 7 si cumple con esa condición,
_ o imprima es mayor a 30 y múltiplo de 2 si cumple con esa condición,
_ imprima si el cociente de la división de dicho número con 5 es mayor a 10 sin importar las condiciones previas.*/
import java.io.*;

public class parte_4_p1_ejercicio_3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero;

        try {
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());
            if ((numero %6 == 0)&&(numero %7 == 0)) {
                System.out.println("Es múltiplo de 6 y de 7");
            }
            if((numero > 30)&&(numero %2 == 0)){
                System.out.println("Es mayor a 30 y múltiplo de 2");
            }
            if((numero / 5) > 10){
                System.out.println("El cociente es mayor a 10");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }   
    }
