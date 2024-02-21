/*Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, acumule la cantidad de vocales que ingreso. Finalmente
muestre por pantalla dicha cantidad.*/


import java.io.*;
public class parte_5_ejercicio_8 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        char caracter;
        int cantVocales=0;

        try {
            System.out.println("Ingrese letra minúscula//0 para finalizar");
            caracter = entrada.readLine().charAt(0);
            while ((caracter>='a')&&(caracter<='z')) {
                switch (caracter) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    cantVocales++;
                        break;
                }
                System.out.println("Ingrese letra minúscula//0 para finalizar");
                caracter = entrada.readLine().charAt(0);
            }
            System.out.println("La cantidad de vocales ingresadas es: " + cantVocales);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
