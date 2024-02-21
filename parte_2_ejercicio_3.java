// package parte_2_variables_y_constantes;

/*Escribir un programa que pida que se ingresen datos necesarios para emitir una
factura por la compra de dos artículos de librería (tipo factura, número, nombre
cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
salida debe imprimir por pantalla la factura en un formato similar al siguiente
(utilizar literales):*/
import java.io.*;
public class parte_2_ejercicio_3 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int numeroFactura;
		double importe1, importe2, importeTotal;
		char tipoFactura;
		String nombreCliente, producto1, producto2;
		
		try{
			System.out.println("Ingrese tipo de factura");
			tipoFactura = entrada.readLine().charAt(0);
			System.out.println("Ingrese numero de factura");
			numeroFactura = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese Nombre Cliente: ");
			nombreCliente = entrada.readLine();			
			System.out.println("Ingrese el primer producto");
			producto1 = entrada.readLine();
			System.out.println("Ingrese el importe del primer producto");
			importe1 = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo producto");
			producto2 = entrada.readLine();
			System.out.println("Ingrese el importe del segundo producto");
			importe2 = Double.valueOf(entrada.readLine());
			
			importeTotal = importe1 + importe2;
			
			System.out.println("Factura\t\t'"+tipoFactura+"'\t\t"+numeroFactura);
			System.out.println("Nombre y Apellido\t"+nombreCliente);
			System.out.println("Producto\t\t\t\t importe");
			System.out.println(producto1+"\t\t\t\t\t"+importe1);
			System.out.println(producto2+"\t\t\t\t"+importe2);
			System.out.println("Importe Total\t\t\t\t"+importeTotal);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
