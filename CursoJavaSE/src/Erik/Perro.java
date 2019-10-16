package Erik;

public class Perro implements ICanino{
	private String raza;

	@Override
	public void setRaza(String raza) {
		this.raza=raza;
		
	}

	@Override
	public String getRaza() {
		return this.raza;
		
	}

	@Override
	public String ladrar() {
		// TODO Auto-generated method stub
		return "GUAU GUAU";
	}
	
	



}
