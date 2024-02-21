// package parte_2_variables_y_constantes;
/*Escribir un programa que declare tres variables de tipo double y
una constante de tipo double con valor 1.0 . Luego debera
asignar el valor de la constante a una de la variables declaradas,
y posteriormente sobre las dos restantes variables se le debera
asignar el valor de la variable que inicialmente fue seteada con el
valor de la constante. Finalmente imprima por pantalla cada una
de las variables.*/
public class parte_1_ejercicio_2 {

	public static void main(String[] args) {
		double numero1, numero2, numero3;
		final double constante = 1.0;
		
		numero1 = constante;
		numero2 = 1.0;
		numero3 = 1.0;
		
		System.out.println("Variable 1 -> "+numero1+"-Variable 2-> "+numero2+"-Variable 3-> "+numero3);
		System.out.println("Constante-> "+constante);

	}

}
