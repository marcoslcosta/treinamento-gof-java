
public class MinhaApp {

	public static void main(String[] args) {
		//developer
		Developer pEstagiario = new Developer("jose", 900);
		Developer pJunior = new Developer("Pedro", 2900);
		Developer pSenior = new Developer("Ricardo", 3900);
		
		//Manage
		Manage g1 = new Manage("João", 15000);
		Manage g2 = new Manage("Maria", 15000);
		Manage g3 = new Manage("Carlos", 15000);
		
		//Montar a estrutura
		g1.add(pEstagiario);
		g1.add(pJunior);
		
		
		g2.add(pSenior);
		
		
		g3.add(g1);
		g3.add(g2);
		
		
		g3.print();
		
		

		
		
	}

}
