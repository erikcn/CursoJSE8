package abstracto;

public class Main {

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		t.setBase(10);
		t.setAltura(6);
		t.setNombre("Triangulo");
		
System.out.println("Area: " + t.getArea());
System.out.println(t.nombre);
		


Cuadrado c = new Cuadrado();
c.setNombre("Cuadrado");
c.setLado(8.0);

System.out.println("Area: " + c.getArea());
System.out.println(c.nombre);
		
	


	}

}
