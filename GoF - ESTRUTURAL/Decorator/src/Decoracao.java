
public class Decoracao extends Arvore {

	private final Arvore arvore;
	
	public Decoracao(Arvore arvore)
	{
		this.arvore = arvore;
	}
	
	@Override
	public void ShowEnfeites() {
		arvore.ShowEnfeites();
		
	}
	
	

}
