import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Carro, Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		String acao = String.valueOf(arg1);
		
		if(acao.equals("Frente"))
		{
			this.vai();
		}
		else if(acao.equals("Direita"))
		{
			this.direita();
		}
		else if(acao.equals("Esquerda"))
		{
			this.esquerda();
		}
		else if(acao.equals("Para"))
		{
			this.para();
		}
	}

	@Override
	public void vai() {
		System.out.println("Carro policia segue em frente.");
		
	}

	@Override
	public void direita() {
		System.out.println("Carro policia vira a direita.");
		
	}

	@Override
	public void esquerda() {
		System.out.println("Carro policia vira a esquerda.");
		
	}

	@Override
	public void para() {
		System.out.println("Carro policia para.");
		
	}

}
