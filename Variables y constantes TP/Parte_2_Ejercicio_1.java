/*Escribir un programa que solicite y luego muestre por consola los valores necesarios para dibujar un círculo y un triángulo.
 Hay que determinar en cada caso que constantes (que no se cargan por consola) y variables con tipos son necesarias declarar
 */
 
import java.io.BufferedReader; //BufferedReader lee el texto de un flujo de entrada de caracteres, almacenando en búfer caracteres para proporcionar una lectura eficaz de caracteres, matrices y líneas
import java.io.InputStreamReader; //biblioteca con operaciones de E/S para operaciones predefinidas. Abre un flujo de entrada de datos en la computadora
//si se pone import java.io.* se hace la importación de los dos

public class Parte_2_Ejercicio_1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); // buffer de entrada
        double base, altura, area, diametro, circunferencia;
        final double PI = 3.1415926;
        try { // try-catch sirve para intentar ejecutar el código y capturar errores en él.
              // Maneja errores en la ejecución
            System.out.println("Ingresar base triángulo");
            base = Double.valueOf(entrada.readLine());
            System.out.println("Ingresar altura triángulo");
            altura = Double.valueOf(entrada.readLine());
            area = base * altura;

            System.out.println("La base del triángulo es: " + base);
            System.out.println("La altura del triangulo es:" + altura);
            System.out.println("Su área es: " + area);
            
            System.out.println("Ingresar diámetro del círculo");
            diametro = Double.valueOf(entrada.readLine());
            circunferencia = diametro * PI;

            System.out.println("La circunferencia del círculo es: " + circunferencia);

        } catch (Exception exc) { // se ejecuta ante un error de lectura
            System.out.println(exc);
        }
    }
}