package Lambdas;

public class LambdaExample2 {

	//Variables globales se pueden accesar desde lambda
	private static double num1;
	private static double num2;
	
	public static void main(String[] args) {
		LambdaExample2 app = new LambdaExample2();
		app.operarEjemplo();
		
		

	}
	
	public void operarEjemplo() {
		double x =3; //No se pueden modificar variables final
		
		Operacion op = (double a, double b) -> {
			num1 = a+b+x;
			num2 = num1;
			return num2; 
		};
		
		System.out.println(op.operar(1,2));
		op.hola();
		
		
		Operacion multi = (q,w) -> {
			return q * w ;
		};
		System.out.println(multi.operar(2, 4));
			
	}

}

