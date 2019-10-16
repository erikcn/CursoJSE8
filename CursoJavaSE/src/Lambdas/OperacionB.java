package Lambdas;

public interface OperacionB {
	public double metodoOperacionB();

	public default void hola() {
		System.out.println("Metodo default de OperacionB  ");
	}

}
