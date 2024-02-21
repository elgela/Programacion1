// package parte_2_variables_y_constantes;
/*Escribir un programa que solicite los siguientes datos de una persona (nombre,
apellido, edad, altura, ocupaci�n, direcci�n) y los imprima por pantalla.*/
import java.io.*;
public class parte_2_ejercicio_2 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre, apellido, ocupacion, direccion;
		int edad;
		double altura;
		try{
			System.out.println("Ingrese nombre");
			nombre = entrada.readLine();
			System.out.println("Ingrese apellido");
			apellido = entrada.readLine();
			System.out.println("Ingrese edad");
			edad = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese Altura en mt");
			altura = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese Ocupacion");
			ocupacion = entrada.readLine();
			System.out.println("Ingrese Direccion");
			direccion = entrada.readLine();
			System.out.println("El nombre es : "+nombre+" "+apellido);
			System.out.println("Su edad es: "+edad+" y tiene una altura de: "+altura+ "cm");
			System.out.println("Vive en: "+direccion);
			System.out.println("Su ocupacion es: "+ocupacion);
			
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
