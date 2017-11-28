
public class MinhaApp {

	public static void main(String[] args) {
		CarroPolicia carroPolicia = new CarroPolicia();
		
		CarroRoubado carroRoubado = new CarroRoubado();
		
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.vai();
		carroRoubado.direita();
		carroRoubado.vai();
		carroRoubado.esquerda();
		carroRoubado.para();
				
	}

}
