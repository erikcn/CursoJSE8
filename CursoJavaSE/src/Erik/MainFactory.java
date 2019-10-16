package Erik;

public class MainFactory {
	

	public static void main(String[] args) {
		Perro firulais = (Perro) createCanino("Perro");
		Lobo l = (Lobo) createCanino("Lobo");
		
		//Lobo l = (Lobo) createCanino("Lobo");
		
		System.out.println(firulais.ladrar());
		System.out.println(l.ladrar());
	}
		
		public static ICanino createCanino(String tipo) {
			ICanino canino = null;
			
			if(tipo.equals("Perro")) {
				canino=new Perro();
			} else if (tipo.equals("Lobo")) {
				canino=new Lobo();
			}
			
			return canino;
			
			
		}

}
