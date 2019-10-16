package strings;

public class Main {

	public static void main(String[] args) {
		String nombre="Erik";
		float peso = 66.5F;
		int edad = 35;
		
		
		String result = String.format("Hola %s te aviso que a tus %d años pesas %f lo cual es correcto", nombre,edad,peso);
		System.out.println(result);
		
		
		
		
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hola").append("Erik");
		System.out.println("StringBuilder: " + builder);
		
		
	}

}
