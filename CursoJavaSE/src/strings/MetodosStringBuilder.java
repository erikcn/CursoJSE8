package strings;

public class MetodosStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hola ").append("Amigos");
		System.out.println(builder.toString());
		
		builder.appendCodePoint(100);
		System.out.println(builder.toString());
		
		builder.reverse();
		System.out.println(builder.toString());
		
		builder.reverse();
		System.out.println(builder.toString());
		
		builder.replace(1, 3, "AAAAAAAA");
		System.out.println(builder.toString());



	}

}
