package escuela;

public class Main {

	public static void main(String[] args) {
		String nombre="Erik Corderito" ;
		int edad=25;
		
		Alumno a = new Alumno();
		Alumno b = new Alumno(nombre);
		Alumno c = new Alumno(nombre, edad);

		System.gc();
	}

}
