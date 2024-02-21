// package parte_2_variables_y_constantes;

/*Escribir un programa que solicite y luego muestre por consola los valores
necesarios para dibujar un circulo y un triangulo. Hay que determinar en cada
caso que constantes (que no se cargan por consola) y variables con tipos son
necesarias declarar.*/
import java.io.*;
public class parte_2_ejercicio_1 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		double base, altura, area, diametro, circunferencia;
		final double pi = 3.14;
		try{
			
			System.out.println("Ingrese la Base para dibujar un triangulo");
			base = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese la Altura para dibujar un triangulo");
			altura = Double.valueOf(entrada.readLine());
			area = base * altura;
			System.out.println("El Area es-> "+area+" La Base es-> "+base);
			System.out.println("La Altura del triangulo es-> "+altura);
			
			System.out.println("Ingrese el diametro para dibujar un circulo");
			diametro = Double.valueOf(entrada.readLine());
			circunferencia = diametro * pi;
			System.out.println("la circunferencia del circulo es -> "+circunferencia);
			
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}

	}

}
