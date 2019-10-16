package Lambdas;

public class LambdaConMetodo {

	public static void decirHola() {
		System.out.println("Hola bebe, ¿como has estado?");
	}
	
	
	public static void main(String args[]) {
		
		LambdaConMetodo app = new LambdaConMetodo();
		
		
		//REferencias a metodo
		Operacion2 op = () -> LambdaConMetodo.decirHola();
		op.hola();
		
		Operacion2 op2 = LambdaConMetodo::decirHola;
		op2.hola();
		
	}
	
	
}

