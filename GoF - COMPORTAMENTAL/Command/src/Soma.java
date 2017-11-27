
public class Soma extends Command {

	private Calculadora calculadora;
	private int numero;
	
	public Soma(Calculadora calculadora, int numero)
	{
		this.calculadora = calculadora;
		this.numero = numero;

	}
	
	@Override
	public void execute() {
		this.calculadora.setValor(this.calculadora.getValor() + numero);
		System.out.println(this.calculadora.getValor());
		
	}

	@Override
	public void undo() {
		this.calculadora.setValor(this.calculadora.getValor() - numero);
		System.out.println(this.calculadora.getValor());
		
	}

}
