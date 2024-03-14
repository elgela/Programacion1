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

            cargar_arreglo_aleatorio_int(arreglo);
            imprimir_arreglo(arreglo);
            System.out.println("Ingrese un número: ");
            numero = Integer.valueOf(entrada.readLine());
            corrimiento_a_derecha(arreglo);
            arreglo[0] = numero;
            imprimir_arreglo(arreglo);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void corrimiento_a_derecha(int[] arreglo) {
        int indice = MAX - 1;
        while (indice > MINVALOR - 1) {
            arreglo[indice] = arreglo[indice - 1];
            indice--;
        }
    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = r.nextInt(MAXVALOR - MINVALOR + 1);
        }
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
}
