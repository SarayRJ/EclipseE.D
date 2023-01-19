package es.studium.Ejercicios;

import java.util.Scanner;

public class Ejercicio2Refactorizacion
{

	private static String nombre = "¿Cómo te llamas?";
	private static String edad = "¿Cuántos años tienes?";
	private static String curso = "¿En qué curso estás?";

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in); // instanciar un objeto de tipo scaner y crear un constructor de tipo
													// escaner

		System.out.println(nombre); // lanzamos un mensaje y..
		String nombre = teclado.nextLine();// lo guardamos la respuesta aqui

		System.out.println(edad);
		String edad = teclado.nextLine();
		System.out.println(curso);
		String curso = teclado.nextLine();
		mensaje(nombre, edad, curso); // creamos una funcion que se llama mensaje a donde mandamos toda la
							// informacion, la podemos llamar solo con su nombre y no instanciarla porque es
							// "static", la podemos llamar desde otra clase del programa poniendo el nombre
							// de la clase.mensaje
		teclado.close();

	}

	public static void mensaje(String nombre, String edad, String curso) // funcion mensaje
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);

	}
}
//Vamos a usar una refactorizacion para extraer la variable local de las preguntas, luego las variables locales las convertimos en atributo(convert to field) de lase para poder usarlas en varias clasres