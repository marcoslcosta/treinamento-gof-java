import java.util.HashMap;

public class FiguraFactory {

	private static final HashMap<String, Figura> figuras = new HashMap<String, Figura>() ;
	
	public static Figura getFigura(String nome)
	{
		Figura fig = figuras.get(nome);
		
		if(fig == null)
		{
			if(nome.equals("Oval preenchida")) {
				fig = new Oval(true);
			}
			else if(nome.equals("Oval não preenchida"))
			{
				fig = new Oval(false);
			}
			else {
				fig = new Linha();
			}
			
			figuras.put(nome, fig);
		}
				
		return fig;
		
	}
	
}
