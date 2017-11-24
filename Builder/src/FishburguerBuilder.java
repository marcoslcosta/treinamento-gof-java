
public class FishburguerBuilder extends SanduicheBuilder {
	private Sanduiche s = new Hamburguer();

	public void abrePao(){
		System.out.println("Abre p�o de fishburguer.");
	}

	public void insereIngredientes(){
		System.out.println("Insere fil� de peixe.");
	}


	public void fechaPao(){
		System.out.println("Fecha p�o de fishburguer.");
	}

	public Sanduiche getSanduiche() {
		System.out.println("fishburguer est� pronto.");
		return s;
	}
}
