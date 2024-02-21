/*Escribir un programa que solicite los siguientes datos de una persona (nombre, apellido, edad, altura, ocupación, dirección) y los imprima por pantalla */

import java.io.*;

public class Parte_2_Ejercicio_2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre, apellido, ocupacion, direccion;
        int edad;
        double altura;

        try {
            System.out.println("Nombre:");
            nombre = entrada.readLine();
            System.out.println("Apellido:");
            apellido = entrada.readLine();
            System.out.println("Edad:");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Altura:");
            altura = Double.valueOf(entrada.readLine());
            System.out.println("Ocupación:");
            ocupacion = entrada.readLine();
            System.out.println("Dirección:");
            direccion = entrada.readLine();

            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
            System.out.println("Ocupación: " + ocupacion);
            System.out.println("Dirección: " + direccion);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
