/*Escribir un programa que imprima por pantalla la tabla de valores
de verdad para el or y and por separado.*/

public class parte_3_ejercicio_2 {
    public static void main(String[] args) {
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("\n");
        System.out.println("Tabla de valor de AND\t\t\tTabla de valor de Or");
        System.out.println("\n");
        System.out.println(" P\t Q\tP y Q\t\t\t P\tQ\tP o Q");
        System.out.println("true"+"\t"+"true"+"\t"+(verdadero)+"\t\t\t"+"true\ttrue\t"+(verdadero));
        System.out.println("true\tfalse\t"+(verdadero&&falso)+"\t\t\t"+"true\tfalse\t"+(verdadero||falso));
        System.out.println("false\ttrue\t"+(falso&&verdadero)+"\t\t\t"+"false\ttrue\t"+(falso||verdadero));
        System.out.println("false\tfalse\t"+(falso)+"\t\t\t"+"false\tfalse\t"+(falso));
    }
}
