/*Escribir un programa que ingrese un número entero por teclado e imprima el resultado de determinar:
_ es múltiplo de 6 y de 7,
_ es mayor a 30 y múltiplo de 2, o es menor igual a 30,
_ el cociente de la división de dicho número con 5 es mayor a 10.*/

import java.io.*;

public class Parte_3_Ejercicio_4 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero, cociente;
        boolean resultado;

        try {
            System.out.println("Ingrese número entero:");
            numero = Integer.valueOf(entrada.readLine());
            resultado = ((numero%6==0)&&(numero%7==0));
            System.out.println(numero + " es multiplo de 6 y de 7? \n" + resultado);
            
            resultado = ((numero>30)&&(numero%2==0));
            System.out.println(numero + " es mayor a 30 y múltiplo de 2? \n" + resultado);
            
            resultado = numero <= 30;
            System.out.println(numero + " es menor o igual a 30? \n" + resultado);
            
            cociente = (numero/5);
            resultado = cociente>10;
            System.out.println("El cociente de la división de " + numero + " con 5 es: \n" + cociente);
            System.out.println("Ese cociente es mayor a 10? \n" + resultado);              
        } catch (Exception exc) {
            System.out.println("Error!");
        }
        
    }
}
