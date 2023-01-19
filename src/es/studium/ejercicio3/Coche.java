package es.studium.ejercicio3;

public class Coche extends Vehiculo
{
	private Conductor conductor = new Conductor();

	public Coche()// como son privados habrá un metodo get y set de cada uno de ellos
	{
		super(); // llamada al constructor de la clase padre
		conductor.setNombreConductor("");
		conductor.setCarnetConductor("");

	}

	public Coche(String matricula, String nombreConductor, String carnetConductor, int numeroRuedas) // constructor por
																										// parametros
	{
		super(matricula, numeroRuedas);
		this.conductor.setNombreConductor(nombreConductor);
		this.conductor.setCarnetConductor(carnetConductor);

	}

	public String getNombreConductor()
	{
		return conductor.getNombreConductor();
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.conductor.setNombreConductor(nombreConductor);
	}

	public String getCarnetConductor()
	{
		return conductor.getCarnetConductor();
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.conductor.setCarnetConductor(carnetConductor);
	}

	public String getDetalles()
	{
		return "Coche [matricula=" + matricula + ", nombreConductor=" + conductor.getNombreConductor()
				+ ", carnetConductor=" + conductor.getCarnetConductor() + "]"; // para mostrar por consola los valores
																				// de atributos de la clase con la que
																				// estemos trabajando , en un metodo
																				// main ponemos un syso y sacamos la
																				// info a traves de coche.getDetalles y
																				// nos saldria toda esta información
	}
}
