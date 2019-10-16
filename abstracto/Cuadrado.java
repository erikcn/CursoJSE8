package abstracto;

public class Cuadrado extends Figura {

	private double lado;
	
	
	public double getLado() {
		return lado;
	}


	public void setLado(Double lado) {
		this.lado = lado;
	}


	@Override
	public double getArea() {
		
		return this.lado * this.lado;
	}

}
