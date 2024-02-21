/*Realizar un programa que dado dos números enteros y un
 carácter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operación matemática básica
considerando el valor del carácter. Si ingreso el caracter:
– ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división
entre ambos números.*/

import java.io.*;

public class parte_6_ejercicio_9 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero1, numero2;
        char caracter;
        try {
            System.out.println("Ingrese primer número entero");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo número entero");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un caracter que corresponda a lo que quiere realizar");
            System.out.println("'a': suma, 'b': resta, 'c': multiplicación, 'd': división");
            caracter = entrada.readLine().charAt(0);
            resultados(numero1, numero2, caracter);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void resultados(int numero1, int numero2, char caracter){
        int resultado=0;
        String operación="";
        String signo="";
        switch (caracter) {
            case 'a':
                operación = "suma";
                signo = "+";
                resultado = numero1 + numero2;
                break;

            case 'b':
                operación = "resta";
                signo="-";
                resultado = numero1 - numero2;
                break;
            case 'c':
                operación = "Multiplicación";
                signo="*";
                resultado = numero1 * numero2;
                break;
            case 'd':
                operación = "División";
                signo="/";
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Incorrecto");
        }
        System.out.println('\0');
        System.out.println("La operación es: "+operación);
        System.out.println(numero1+" "+signo+" "+numero2+" = "+resultado);
    }
}
