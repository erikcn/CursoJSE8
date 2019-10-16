package strings;

public class StringBuilderLlenado {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();

		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			builder.append(i);
		}
		long end = System.nanoTime();
		long dif = end - start;

		System.out.println("Tiempo llenado StringBuilder: " + dif);
		
		
		
		

		String datos = null;
		long start2 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			datos += i;
		}
		long end2 = System.nanoTime();
		long dif2 = end2 - start2;

		System.out.println("Tiempo llenado String       : " +dif2);

	}

}
