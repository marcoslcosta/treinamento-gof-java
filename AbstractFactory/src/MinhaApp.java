import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {

	public static void main(String[] args)
	{
		EmpresaOnibus viacaoXYZ= new ConcretaEmpresaOnibus();
	
		PassagemOnibusInterestadual pInterestadual = viacaoXYZ.emitePassagemOnibusInterestadual("S�o Paulo", "Rio de janeiro", new GregorianCalendar(2016, Calendar.APRIL, 01));
		PassagemOnibusUrbano pUrbano = viacaoXYZ.emitePassagemOnibusUrbano("S�o Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 01));
		
		pUrbano.exibeDetalhes();
		pInterestadual.exibeDetalhes();
		
	}
	
}
