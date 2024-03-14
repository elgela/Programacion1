/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
menor posición del arreglo.*/

import java.util.Random;
import java.io.*;

public class parte_7_ejercicio_3 {
    public static int MAXVALOR = 10;
    public static int MINVALOR = 1;
    public static int MAX = 10;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arreglo = new int[MAX];
        int posicion;

        try {

            cargar_arreglo_aleatorio_int(arreglo);
            imprimir_arreglo(arreglo);
            System.out.println("Ingrese la posición: ");
            posicion = Integer.valueOf(entrada.readLine());
            correr_a_izquierda(arreglo, posicion);
            imprimir_arreglo(arreglo);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void correr_a_izquierda(int[] arreglo, int posicion) {
        while (arreglo[posicion] < arreglo[MAXVALOR - 1]) {
            arreglo[posicion] = arreglo[posicion + 1];
            posicion++;
        }
    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
}
