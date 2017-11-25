import java.util.Hashtable;

public class Partitura {

	private static Hashtable<String, NotaMusical> notaMap = new  Hashtable<String, NotaMusical>();
	
	public static void carregaNotas() {
		Do notaDo = new Do();
		notaMap.put("D�", notaDo);
		
		Re notaRe = new Re();
		notaMap.put("R�", notaRe);
		
		Mi notaMi = new Mi();
		notaMap.put("M�", notaMi);
		
		Fa notaFa = new Fa();
		notaMap.put("F�", notaFa);
		
		Sol notaSol = new Sol();
		notaMap.put("Sol", notaSol);
		
		La notaLa = new La();
		notaMap.put("L�", notaLa);
		
		Si notaSi = new Si();
		notaMap.put("S�", notaSi);
		
		
	}
	
	public static NotaMusical getNota(String nome)
	{
		NotaMusical nota = notaMap.get(nome);
		return nota.Clone();
	}
}
