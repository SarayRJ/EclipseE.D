package es.studium.refactorizacion2;

public class ExtraerVariableLocal2 //HEMOS CONVERTIDO UNA VARIABLE LOCAL EN UN ATRIBUTO DE CLASE
{
	private static int numero; //Al crearla aqui la variable ya no es local sino global, porque ya podemos ponerla en funcion y usarla en otras cosas, no como la local que solo puede utilizarse en el metodo main.

	public static void main(String[] args)
	{
		ExtraerVariableLocal2 refactor = new ExtraerVariableLocal2 ();
		
		numero = 3;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero) );
	}

	public double calcularFactorial(double n)
	{
		numero = 10; //ejemplo solo par aver que tambien podemos utilizar la variable numero dentro de la funcion.
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
