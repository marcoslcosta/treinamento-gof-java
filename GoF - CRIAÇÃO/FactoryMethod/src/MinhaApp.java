import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {
	public static void main(String[] args)
	{
		Empresa viacaoABCLocal = new EmpresaOnibusUrbano();
		Empresa viacaoXYZInter = new EmpresaOnibusInterestadual();
		
		Passagem pUrbano = viacaoABCLocal.emitePassagem("S�o Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 01));
		Passagem pInter = viacaoXYZInter.emitePassagem("S�o Paulo", "Rio de janeiro", new GregorianCalendar(2016, Calendar.APRIL, 01));
		
		pInter.exibeDetalhes();
		pUrbano.exibeDetalhes();
		
	}
}
