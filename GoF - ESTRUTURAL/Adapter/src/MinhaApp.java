
public class MinhaApp {

	public static void main(String[] args) {
	//adaptado
	PlugAmericano plugEUA = new PlugAmericano();
	
	AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
	String s = tomadaModificada.conecta(plugEUA);
	
	System.out.println(s);
	
	}

}
