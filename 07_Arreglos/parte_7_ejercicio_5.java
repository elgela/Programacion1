/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine la primer ocurrencia de numero (un
número igual) en el arreglo si existe. Para ello tendrá que buscar la posición y si está, realizar un
corrimiento a izquierda (queda una copia de la última posición del arreglo en la anteúltima
posición).*/

import java.util.Random;
import java.io.*;
public class parte_7_ejercicio_5 {
    public static int MAXVALOR = 10;
    public static int MINVALOR = 1;
    public static int MAX = 10;
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [] arreglo = new int [MAX];
        int numero, posicion;

        try {
            cargar_arreglo_aleatorio_int(arreglo);
            imprimir_arreglo(arreglo);
            System.out.println("Ingrese un número: ");
            numero = Integer.valueOf(entrada.readLine());
            posicion = buscar_la_posicion(arreglo, numero);
            if (posicion < MAX) {
                corrimiento_a_izquierda(arreglo, posicion);
                System.out.println("El número se encuentra en la posicion: " + posicion);
            } else {
                System.out.println("El número no se encuentra");
                System.out.println("\0");
            }
            // imprimir_arreglo(arreglo);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int buscar_la_posicion(int [] arreglo, int numero) {
        int posicion = 0;
        while ((posicion < MAX) && (arreglo[posicion] != numero)) {
            posicion++;
        }
        return posicion;
    }

    public static void corrimiento_a_izquierda(int [] arreglo, int posicion) {
        for (int pos = 0; pos < MAX - 1; pos++) {
            arreglo[pos] = arreglo[pos + 1];
        }
    }

    public static void cargar_arreglo_aleatorio_int(int [] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo(int [] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
        }
    }
}
