/*Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días) (¿mostrar por pantalla la
cantidad de días del mes debería realizarse con un método? Debería).*/

import java.io.*;
                                  /*Echo por mi */

// public class parte_6_ejercicio_7 {
//     public static final int MIN=1;
//     public static final int MAX=12;
//     public static void main(String[] args) {
//         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
//         int numero;

//         try {
//             System.out.println("Ingrese número de mes:");
//             numero = Integer.valueOf(entrada.readLine());

//             while ((numero>=MIN)&&(numero<=MAX)) {
//                 cant_dias_mes(numero);
//                 System.out.println('\0');
//                 System.out.println("Ingrese número de mes:");
//                 numero = Integer.valueOf(entrada.readLine());
//             }
//         } catch (Exception exc) {
//             System.out.println(exc);
//         }
//     }

//     public static int cant_dias_mes(int mes){
//             switch (mes) {
//                 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                     System.out.println("El mes tiene 31 días");
//                     System.out.println('\0');
//                     break;
//                 case 4 : case 6: case 9: case 11:
//                     System.out.println("El mes tiene 30 días");
//                     System.out.println('\0');

//                     break;
//                 default:{
//                     System.out.println("El mes tiene 28 días");
//                     System.out.println('\0');
//                 }
//                     break;
//             }
        
//         return mes;
//     }
// }

public class parte_6_ejercicio_7 {
	public static final int MAX = 12;
	public static final int MIN = 1;
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int numero, diasMes;	
		try{
			System.out.println("Ingrese un numero de mes");
			numero = Integer.valueOf(entrada.readLine());
			while((numero>=MIN)&&(numero<=MAX)){
				identificadorDeMes(numero);
				diasMes = cantidadDiasMesIngresado(numero);
				
				System.out.println("La cantidad de dias que tiene el mes ingresado es: "+ diasMes);
				System.out.println("Ingrese un numero de mes");
				numero = Integer.valueOf(entrada.readLine());
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static int cantidadDiasMesIngresado(int numero){
		int dias;
		switch(numero){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
			dias = 31;
			break;
		}
		case 4: case 6: case 9: case 11:{
			dias = 30;
			break;
		}
		default:{
			dias = 28;
		}
		}
		return dias;
	}
	
	public static void identificadorDeMes(int numero){
		String mes="";
		switch(numero){
		case 1:{
			mes = "enero";
			break;
		}case 2:{
			mes = "febrero";
			break;
		}case 3:{
			mes = "marzo";
			break;
		}case 4:{
			mes = "abril";
			break;
		}case 5:{
			mes = "mayo";
			break;
		}case 6:{
			mes = "junio";
			break;
		}case 7:{
			mes = "julio";
			break;
		}case 8:{
			mes = "agosto";
			break;
		}case 9:{
			mes = "septiembre";
			break;
		}case 10:{
			mes = "octubre";
			break;
		}case 11:{
			mes = "noviembre";
			break;
		}case 12:{
			mes = "diciembre";
			break;
		}
		}
		System.out.println("El mes ingresado es: "+mes);
	}
	
	
}