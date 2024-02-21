/*Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días).*/

import java.io.*;
public class parte_5_ejercicio_10 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = 12;
        final int MIN = 1;
        int mes;

        try {
            System.out.println("Ingrese número de mes: // 0 para finalizar");
            mes = Integer.valueOf(entrada.readLine());
            while ((mes>=MIN)&&(mes<=MAX)) {
                switch (mes) {
                    case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                    System.out.println("El mes ingresado tiene 31 días");
                    System.out.println('\0');
                    break;
                    case 4 : case 6 : case 9 : case 11 :
                    System.out.println("El mes ingresado tiene 30 días");
                    System.out.println('\0');
                    break;
                    default:{
                    System.out.println("El mes ingresado tiene 28 días");
                    System.out.println('\0');
                    break;
                    }
                }
                System.out.println("Ingrese número de mes // 0 para finalizar");
                mes = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println("Error! Debe ingresar un número");
        }
    }
}
