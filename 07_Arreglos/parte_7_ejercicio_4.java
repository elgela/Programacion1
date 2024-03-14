/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo (posición
0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo) y
colocar el numero en el arreglo en la posición indicada.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class parte_7_ejercicio_4 {
    public static int MAXVALOR = 10;
    public static int MINVALOR = 1;
    public static int MAX = 10;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arreglo = new int[MAX];
        int numero;

        try {

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void corrimiento_a_derecha(int[] arreglo) {
        int indice = MAX - 1;
        while (indice > MINVALOR - 1) {
            
        }
    }
}
