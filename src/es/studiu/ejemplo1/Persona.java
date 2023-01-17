package es.studiu.ejemplo1;

public class Persona {
	/*Atributos, las variables que nos proporcionan las caracteristicas de las clases*/
	
	private String nombre;
	private String apellido;
	private int edad;
	private boolean haPagado;
	/*Comentario para probar lo de renovar en commit*/
	
	
	/*Constructor vacio o constructor por defecto de la clase de arriba, asignar los atributos que da java por defecto*/
	public Persona() {
		nombre="";
		apellido="";
		edad=0;
		haPagado=false;
	
	}

/*CONSTRUCTOR POR PARAMETROS...this->significa que es atributo de clase de JAVA,(este es..), lo estamos utilizando para que el programa no se haga un lio ya que estamos utilizando el mismo "nombre" tanto para la variable como para el atributo*/
	public Persona(String nom, String ap, int age, boolean hap ) {
		nombre = nom;
		apellido = ap;
		edad = age;
		haPagado = hap;
		
		
	}
/*métodos, le damos a cada objeto un get y un set para en la clase principal poder obtenerlos y sacarlos en consola*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}
	
}
	
	
	
