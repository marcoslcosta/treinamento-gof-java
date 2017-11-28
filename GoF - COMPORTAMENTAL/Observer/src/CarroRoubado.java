import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {

	private String acao = "";
	@Override
	public void vai() {
		this.acao = "Frente";
		System.out.println("Carro roubado segue em frente.");
		this.mudaEstado();
	}

	@Override
	public void direita() {
		this.acao = "Direita";
		System.out.println("Carro roubado vira a direita.");
		this.mudaEstado();
		
	}

	@Override
	public void esquerda() {
		this.acao = "Esquerda";
		System.out.println("Carro roubado vira a esquerda.");
		this.mudaEstado();
		
	}

	@Override
	public void para() {
		this.acao = "Para";
		System.out.println("Carro roubado para.");
		this.mudaEstado();
		
		
	}
	
	public void mudaEstado() {
		setChanged();
		notifyObservers(this.acao);
	}

}
