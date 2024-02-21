/*Escribir un programa que mientras el usuario cargue desde
teclado un caracter letra minúscula, llame a un método
que imprime por pantalla la tabla de multiplicar de 9.*/

import java.io.*;
public class parte_6_ejercicio_3 {
	public static final int MIN = 0;
	public static final int MAX = 10;
	public static final int numero = 9;
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));		
		final char CHARMIN = 'a';
		final char CHARMAX = 'z';
		char caracter;
		try{
			System.out.println("Ingrese caracter letra minuscula");
			caracter = entrada.readLine().charAt(0);
			
			while((caracter>=CHARMIN)&&(caracter<=CHARMAX)){
				tabla_multiplicar_de_nueve();
				System.out.println("Ingrese 0 para finalizar");
				caracter = entrada.readLine().charAt(0);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void tabla_multiplicar_de_nueve(){
		System.out.println("Tabla de multplicar de nueve");
		for(int i=MIN; i<=MAX; i++){
			System.out.println(i + " * "+numero+" = "+i*numero);
		}
	}
	

}
