
public class MinhaApp {

	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();
		SanduicheBuilder b1 = new HamburguerBuilder();
		SanduicheBuilder b2 = new FishburguerBuilder();
		
		//Hamburguer
		cozinha.fazSanduiche(b1);
		b1.getSanduiche();
		
		//Fishburguer
		cozinha.fazSanduiche(b2);
		b2.getSanduiche();
		

	}

}
