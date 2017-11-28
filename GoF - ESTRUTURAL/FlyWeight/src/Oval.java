
public class Oval extends Figura{
	public boolean preenchido;
	
	public Oval(boolean preenchido) {
		super();
		this.preenchido = preenchido;
	}

	
	@Override
	public void desenha(String cor)  {
		if(preenchido)
		{
			System.out.println("Figura Oval preechida " + cor);
		}
		else
		{
			System.out.println("Figura Oval não preechida " + cor);
		}
	}
	

}
