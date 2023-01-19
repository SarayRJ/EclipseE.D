package es.studium.refactorizacion2;

public class RefactorizacionVariableLocal
{ //A cualquier funcion que no es estatica instauramos un objeto de la clase. //NO TIENE NADA QUE VER CON EXTRAER UNA VARIABLE LOCAL.
	public static void main(String[] args)
	{
		RefactorizacionVariableLocal refactor= new RefactorizacionVariableLocal(); //Ya hemos creado el objeto que se llama refactor//Utilizamos el vacio porque no hemos implementado constructores  pero java te permite utilizarlo, otro constructor no t dejaria, pues te  obligaria a utilizar el vacio.
		int numero = 3; //declaracion de variable, 
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero) );
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
	}

	public double calcularFactorial(double n) //implementado funcion o metodo. //Le quitamos static y entonces creamos un objeto para que no nos de error y para llamar a la funcion y poder utilizarlo en mas clases.
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			double resultado = n * calcularFactorial(n - 1); //aqui declaramos una variable para guardar este calculo.
			return resultado; 
		}
	}

}
