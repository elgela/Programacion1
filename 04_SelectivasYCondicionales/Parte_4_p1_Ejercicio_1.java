/*Escribir un programa que permita el ingreso de un caracter y realice:
-imprima "es caracter dígito" si el carácter ingresado es caracter dígito, o imprima "no es caracter dígito"*/
import java.io.*;

public class Parte_4_p1_Ejercicio_1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese caracter: ");
            Double.valueOf(entrada.readLine());
            System.out.println("Es caracter dígito");
            
        } catch (Exception exc) {
            System.out.println("No es caracter dígito");
        }
        
    }
}