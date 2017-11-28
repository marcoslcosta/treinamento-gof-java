
public class Pato extends Ave{

	private Comportamento comportamentoVoar;
	private Comportamento comportamentoGrasnar;
	
	public Pato() {
		this.comportamentoGrasnar = new Grasnar();
		this.comportamentoVoar = new Voar();
	}
	@Override
	public void setComportamentoVoar(Comportamento c) {
		this.comportamentoVoar = c;
		
	}

	
	@Override
	public void setComportamentoGrasnar(Comportamento c) {
		this.comportamentoGrasnar = c;
		
	}
	
	@Override
	public void voar() {
		this.comportamentoVoar.exec();
		
	}


	@Override
	public void grasnar() {
		this.comportamentoGrasnar.exec();
		
	}

	
}
