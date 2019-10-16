package Lambdas;

/*interface functional*/
@FunctionalInterface
public interface Operacion {
	public double operar(double a, double b);

	public default void hola() {
		System.out.println("Comportamiento repetido desdemetodo default  ");
	}
}
