/*Escribir un programa que pida que se ingresen datos necesarios para emitir una
factura por la compra de dos artículos de librería (tipo factura, número, nombre
cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
salida debe imprimir por pantalla la factura en un formato similar al siguiente
(utilizar literales):*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Parte_2_Ejercicio_3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int facturaNumero;
        double importe1, importe2, importeTotal;
        char tipoFactura;
        String nombreCliente, producto1, producto2;

        try {
            System.out.println("Factura tipo:");
            tipoFactura = entrada.readLine() .charAt(0);
            System.out.println("Número de factura:");
            facturaNumero = Integer.valueOf(entrada.readLine());
            System.out.println("Nombre del cliente:");
            nombreCliente = entrada.readLine();
            System.out.println("Nombre producto 1:");
            producto1 = entrada.readLine();
            System.out.println("Importe:");
            importe1 = Double.valueOf(entrada.readLine());
            System.out.println("Nombre producto 2:");
            producto2 = entrada.readLine();
            System.out.println("Importe:");
            importe2 = Double.valueOf(entrada.readLine());

            importeTotal = importe1 + importe2;

            System.out.println("Factura \t\t'" + tipoFactura + "'\t\t" + "nº " + facturaNumero);
            System.out.println("Nombre y Apellido\t" + nombreCliente);
            System.out.println("\n");
            System.out.println("Producto \t\t\t\t  importe");
            System.out.println("\n");
            System.out.println(producto1 + "\t\t\t\t\t" + importe1);
            System.out.println(producto2 + "\t\t\t\t\t" + importe2);
            System.out.println("\n");
            System.out.println("Total: \t\t\t\t\t" + importeTotal);
            
        } catch (Exception exc) {
            System.out.println("Entrada erronea");
        }
        
    }
}
