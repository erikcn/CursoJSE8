package Lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListEjemplo {
	
	List<String> alumnos;
	List<Integer> edades;
	
	
	public ListEjemplo() {
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
	
	public void ordenar() {
		
		
		Collections.sort(alumnos,(n1,n2) -> n1.compareTo(n2));
		alumnos.forEach(System.out::println);
		
		
		Collections.sort(edades ,(n1,n2) -> n1 > n2 ? 1 : -1);
		edades.forEach(System.out::println);
		
		
	}

	public static void main(String[] args) {
	ListEjemplo list = new ListEjemplo();
	list.ordenar();

	}

}
