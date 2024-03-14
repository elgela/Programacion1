/*Siguiendo la Clase 4 Ejercicio 4, hacer un programa completo (usando
métodos donde se requiera) en el cual se solicite de teclado el ingreso de
un día, un número de mes, y un año; luego calcule la cantidad de días
desde la última luna nueva (edad lunar), e informe por pantalla en cual de
las 4 fases se corresponde para esa fecha.*/

import java.io.*;

public class parte_6_ejercicio_12 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int dia, mes, anio, resultadoAureo, resultadoEpacta, edadLunar;

		try {
			System.out.println("Ingrese un día");
			dia = entrada.readLine().charAt(0);
			System.out.println("Ingrese número de mes");
			mes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese año");
			anio = Integer.valueOf(entrada.readLine());

			resultadoAureo = calcularNumeroAureo(anio);
			resultadoEpacta = calculaNumeroEpacta(resultadoAureo);
			edadLunar = calcularEdadLunar(mes, dia, resultadoEpacta);
			queFaseCorresponde(edadLunar);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static int calcularNumeroAureo(int anio) {
		int resultadoAureo = ((anio + 1) % 19);
		return resultadoAureo;
	}

	public static int calculaNumeroEpacta(int resultadoAureo) {
		int resultadoEpacta = (((resultadoAureo - 1) * 11) % 30);
		return resultadoEpacta;
	}

	public static int calcularEdadLunar(int mes, int dia, int resultadoEpacta) {
		int edadLunar;
		if ((mes >= 3) && (mes <= 12)) {
			mes = mes - 2;
			edadLunar = mes + dia + resultadoEpacta;
		} else {
			mes = mes + 10;
			edadLunar = mes + dia + resultadoEpacta;
		}

		if (edadLunar >= 29) {
			edadLunar = edadLunar % 30;
		}
		return edadLunar;
	}

	public static void queFaseCorresponde(int edadLunar) {
		if ((edadLunar > 1) && (edadLunar <= 7)) {
			System.out.println("En ésta fecha corresponde Luna Nueva");
		}
		if ((edadLunar > 7) && (edadLunar <= 14)) {
			System.out.println("En ésta fecha corresponde Luna Creciente");
		}
		if ((edadLunar > 14) && (edadLunar <= 21)) {
			System.out.println("En ésta fecha corresponde Luna Llena");
		}
		if ((edadLunar > 21) && (edadLunar <= 28)) {
			System.out.println("En ésta fecha corresponde Luna Menguante");
		}
	}

}