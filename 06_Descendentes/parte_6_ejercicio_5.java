/*Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, invoque a un método que imprima si es caracter dígito o
caracter letra minúscula, y si es letra minúscula imprimir si es vocal o
consonante.*/

import java.io.*;
public class parte_6_ejercicio_5 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter;
        try {
            System.out.println("Ingrese caracter distinto de '*'");
            caracter = entrada.readLine().charAt(0);

            while (caracter!='*') {
                digito_o_letra_minuscula(caracter);
                System.out.println("Ingrese caracter distinto de '*'");
                caracter = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void digito_o_letra_minuscula(char caracter){
        
        if ((caracter>='1')&&(caracter<='9')) {
            System.out.println("Es caracter dígito");
            System.out.println('\0');
        }
        else if((caracter>='a')&&(caracter<='z')){
            switch (caracter) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("Es minúscula vocal");
                    System.out.println('\0');
                    break;
            
                default:{
                    System.out.println("Es minúscula consonante");
                    System.out.println('\0');
                }
                    break;
            }
        }
    }
}
