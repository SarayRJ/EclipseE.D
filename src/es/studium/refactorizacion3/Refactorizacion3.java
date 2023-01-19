package es.studium.refactorizacion3;

public class Refactorizacion3 //EXTRAER UNA CONSTANTE
{
	private static final String TEXTO = "El factorial de "; //Hemos creado una constante de tipo cadena.

	public static void main(String[] args)
	{
		int numero = 3;
		System.out.println(TEXTO + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println(TEXTO + numero + " es " + calcularFactorial(numero));
	}

	public static double calcularFactorial(double n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
