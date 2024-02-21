/*Escribir un programa que declare tres variables de tipo double y una constante de tipo double con valor 1.0
 Luego deberá asignar el valor de la constante a una de las variables declaradas, y posteriormente sobre las dos restantes variables se le deberá asignar el valor de la variable que inicialmente fué seteada con el valor de la constante. Finalmene imprima por pantalla cada una de las variables
 */

public class Parte_1_Ejercicio_2 {
    public static void main(String[] args) {
        double valor1, valor2, valor3;
        final double valorConst = 1.0;

        valor2 = valorConst;
        valor1 = 1.0;
        valor3 = 1.0;

        System.out.println("Variable 1: " + valor1);
        System.out.println("Variable 2: " + valor2);
        System.out.println("Variable 3: " + valor3);
    }
}
