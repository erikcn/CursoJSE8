package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class ListMetodos {
	List<String> alumnos;
	List<Integer> edades;
	
	
	public ListMetodos() {
		alumnos=new ArrayList<String>();
		alumnos.add("Erik");
		alumnos.add("Alexa");
		alumnos.add("Jon");
		alumnos.add("Ash");
		
		
		edades=new ArrayList<Integer>();
		edades.add(35);
		edades.add(32);
		edades.add(14);
		edades.add(7);

	}
	
	
	public void useForEch() {
		alumnos.forEach(System.out::println);
		//edades.forEach(System.out::println);
	}
	
	public void useRemoveIf() {
		//alumnos.removeIf(n -> n.equalsIgnoreCase("Erik"));
		edades.removeIf(x -> x > 30 );
	}
	
	
	
	public void useSort() {
		alumnos.sort((n1,n2) -> n2.compareTo(n1) );
	}
	
	public static void main(String[] args) {
		ListMetodos app = new ListMetodos();
		
		app.useForEch();
		System.out.println("------");
		
		
		//app.useRemoveIf();
		//app.useForEch();
		app.useSort();
		
		app.useForEch();
		
		

		}
	
	
	

}
