import java.util.Hashtable;

public class Partitura {

	private static Hashtable<String, NotaMusical> notaMap = new  Hashtable<String, NotaMusical>();
	
	public static void carregaNotas() {
		Do notaDo = new Do();
		notaMap.put("Dó", notaDo);
		
		Re notaRe = new Re();
		notaMap.put("Ré", notaRe);
		
		Mi notaMi = new Mi();
		notaMap.put("Mí", notaMi);
		
		Fa notaFa = new Fa();
		notaMap.put("Fá", notaFa);
		
		Sol notaSol = new Sol();
		notaMap.put("Sol", notaSol);
		
		La notaLa = new La();
		notaMap.put("Lá", notaLa);
		
		Si notaSi = new Si();
		notaMap.put("Sí", notaSi);
		
		
	}
	
	public static NotaMusical getNota(String nome)
	{
		NotaMusical nota = notaMap.get(nome);
		return nota.Clone();
	}
}
