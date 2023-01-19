package refactorizacion.explicacion;

public class CalculoCostes
{
	

	private static final int SUELDO_TRABAJADORES = 1200; //Variable constante
	public static void main(String[] args)
	{
		
		System.out.println(costeTrabajadores(50));

	}
	public static double costeTrabajadores (int numeroTrabajadores)//Función
	{
		return SUELDO_TRABAJADORES * numeroTrabajadores; //Queremos refactorizar 1200 como sueldo trabajadores por lo que lo seleccionamos para extraerlo como constante para optimizar
		
	}

}
