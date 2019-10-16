
public class Metodos {
	
	public float sumar(float a,float b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Metodos p = new Metodos();
		
		float n = 1.1F;
		float m = 2.2F;
		
		float resultado = p.sumar(n, m);
		
		System.out.println(resultado);
	}

}
