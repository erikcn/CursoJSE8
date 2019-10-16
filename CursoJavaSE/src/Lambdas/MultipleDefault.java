package Lambdas;

public class MultipleDefault implements Operacion,OperacionB {
	
	public static void main(String[] args) {
		MultipleDefault app = new MultipleDefault();
		app.hola();
		
		
	}

	@Override
	public double operar(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double metodoOperacionB() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void hola() {
		// TODO Auto-generated method stub
		OperacionB.super.hola();
	}

}
