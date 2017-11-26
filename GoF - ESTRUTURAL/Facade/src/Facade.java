
public class Facade {

	private SubsistemaUm sis1;
	private SubsistemaDois sis2;
	private SubsistemaTres sis3;

	public Facade() {
		sis1 = new SubsistemaUm();
		sis2 = new SubsistemaDois();
		sis3 = new SubsistemaTres();
	}


	public void metodoA() {
		sis1.metodoUm();
		sis2.metodoDois();
		sis3.metodoTres();

	}

	public void metodoB() {

		sis3.metodoTres();		
		sis2.metodoDois();
		sis1.metodoUm();
	}

	public void metodoC() {
		sis2.metodoDois();
		sis3.metodoTres();
		sis1.metodoUm();
	}
}
