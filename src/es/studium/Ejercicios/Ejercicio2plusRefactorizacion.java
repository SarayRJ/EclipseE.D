package es.studium.Ejercicios;
import java.util.Scanner;
public class Ejercicio2plusRefactorizacion
{


//Esto es el ejercicio 2 pero a la pregunta y la respuesta la hemos cogido juntas y hemos extraido el metodo y se nos queda...


	private static String nombre = "¿Cómo te llamas?";
	private static String edad = "¿Cuántos años tienes?";
	private static String curso = "¿En qué curso estás?";

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in); 

		String nombre = PreguntaNombre(teclado); //Se nos queda esto

		String edad = PreguntaEdad(teclado);
		String curso = PreguntaCurso(teclado);
		mensaje(nombre, edad, curso); 
		teclado.close();

	}

	public static String PreguntaCurso(Scanner teclado)
	{
		System.out.println(curso);
		String curso = teclado.nextLine();
		return curso;
	}

	public static String PreguntaEdad(Scanner teclado)
	{
		System.out.println(edad);
		String edad = teclado.nextLine();
		return edad;
	}

	public static String PreguntaNombre(Scanner teclado)
	{
		System.out.println(nombre); 
		String nombre = teclado.nextLine();
		return nombre;
	}

	public static void mensaje(String nombre, String edad, String curso) // funcion mensaje
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);

	}
}


