package es.studium.refactorizacion2;

public class ExtraerVariableLocal3Definity //AHORA SI CREAMOS UNA VARIABLE LOCAL
{
	public static void main(String[] args)
	{
		int numero = 3;
		String mensaje = "El factorial de "; //ESTA ES NUESTRA VALRIABLE QIE SOLO VAMOS A PODER UTILIZAR DENTRO DEL METODO MAIN.
		System.out.println(mensaje + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println(mensaje + numero + " es " + calcularFactorial(numero));
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
