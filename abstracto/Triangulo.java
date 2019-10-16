package abstracto;

public class Triangulo extends Figura {
	
	private double  base,altura;
		
	

	@Override
	public double getArea() {
		return this.base * this.altura / 2;
	}
	
	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}

}
