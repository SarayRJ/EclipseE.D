package es.studium.interfaces;

public class Principal
{

	public static void main(String[] args)
	{
		/*Creamos objeto implementando el constructor*/
		Acumulador acumulador = new Acumulador(10); 
		acumulador.incremento(15); /*le estamos sumando 15 a 10*/
		
		IModificacion acumulador2 =  new Acumulador(10);
		acumulador2.incremento(15);
		
		INumerico acumulador3 = new Acumulador(10);
		acumulador3.setMaximo(120);
		
		IConstantes acumulador4 = new Acumulador(10);
		
		
		
		}
		

	}


