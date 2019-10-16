
public class Metodo {
	
	public void decirHola() {
		System.out.println("HOLA DESDE Metodo");
	}
	
	public static void decirHola2() {
		System.out.println("HOLA DESDE Metodo static");
	}
	
	public static void main(String[] args) {
		Metodo p = new Metodo();
		p.decirHola();
		
		decirHola2();
	}
	
	

}
