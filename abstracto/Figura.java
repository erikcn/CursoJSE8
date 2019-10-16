package abstracto;

public abstract class Figura {
	
	public String nombre;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract double getArea();

	
	
}
