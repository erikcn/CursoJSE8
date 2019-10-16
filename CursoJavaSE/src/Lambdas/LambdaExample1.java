package Lambdas;

public class LambdaExample1 {

	public static void main(String[] args) {
		LambdaExample1 app = new LambdaExample1();
		app.operarEjemplo();
		
		

	}
	
	public void operarEjemplo() {
		Operacion op = (double a, double b) -> (a+b)/2;
		System.out.println(op.operar(5,5));
		
		
		Suma sum = ( x, y) -> {
			return x+y;
			} ;
		System.out.println(sum.sumar(6, 2));
		
		
		Operacion op2 = (a,s) -> a+s;
		System.out.println(op2.operar(2, 5));
		
	}

}

interface Suma{
	public double sumar(double x,double y);
}
