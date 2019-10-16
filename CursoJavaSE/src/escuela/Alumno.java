package escuela;

public class Alumno {

	private String nombre;
	private int edad;

	// Constructor
	public Alumno() {

	}

	// Constructor
	public Alumno(String nombre) {
		this.nombre = nombre;
		System.out.println(nombre);
	}

	// Constructor
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
		System.out.println(nombre);
		System.out.println(edad);
	}

}
