package jaxb;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Principal2 {

	public static void main(String[] args) {
	
		try {
			JAXBContext context = JAXBContext.newInstance( Libro.class );
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Libro libro = (Libro)unmarshaller.unmarshal(
			    new File("src/Libro.xml") );
			
			System.out.println(libro.getTitulo());
			System.out.println(libro.getPaginas());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}