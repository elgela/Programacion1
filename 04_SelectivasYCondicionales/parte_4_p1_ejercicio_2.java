/*Escribir un programa que permita el ingreso de dos números enteros por teclado y realice:
_ imprima A si el primero mayor al segundo,
_ o imprima B si ambos son múltiplos de 2,
_ o imprima C para ninguna de las opciones anteriores*/
import java.io.*;

public class parte_4_p1_ejercicio_2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero1, numero2;
        System.err.println("Ingrese dos números enteros por teclado");
        System.out.println("\t");
        System.out.println("-A- si el primer número es mayor al segundo");
        System.out.println("-B- si ambos son múltiplos de 2");
        System.out.println("-C- para ninguna de las opciones anteriores");
        System.out.println("\t");

        try{
			System.out.println("Ingrese primer número");
			numero1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese segundo número");
			numero2 = Integer.valueOf(entrada.readLine());
            System.out.println("\t");

			if(numero1 > numero2){
				System.out.println("A");
			}
			if((numero1 % 2 == 0)&&(numero2 % 2 == 0)){
				System.out.println("B");
			}
			else{
				System.out.println("C");
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
 
 
 
 
 

 
 
 
 
 
 
 
 
 

 
 
 
 

