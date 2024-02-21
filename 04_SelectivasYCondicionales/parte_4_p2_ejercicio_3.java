/*Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días
de ese mes. En el caso de que ingrese 2 como número de mes
(febrero), para imprimir la cantidad de días deberá solicitar
ingresar un número de anio (no usar ñ),*/

import java.io.*;

public class parte_4_p2_ejercicio_3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int mes, anio;

        try {
            System.out.println("Ingrese número de mes");
            mes = Integer.valueOf(entrada.readLine());

            if ((mes >= 1) && (mes <= 12)) {
                switch (mes) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                        System.out.println("El mes tiene 31 días");
                        break;
                    }
                    case 4: case 6: case 9: case 11: {
                        System.out.println("Ese mes tiene 30 días");
                    }
                        break;
                    case 2: {
                        System.out.println("Ingresar número de año");
                        anio = Integer.valueOf(entrada.readLine());
                        if ((anio %4 == 0) && ((anio %100 != 0) || (anio %400 == 0))) {
                            System.out.println("Fue en año bisiesto");
                        }
                        else{
                            System.out.println("No fue en año bisiesto");
                        }
                    }
                        break;
                }                
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
