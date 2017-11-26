import java.util.ArrayList;
import java.util.List;

public class Manage extends Employee {

	private Employee arvore;
	private List<Employee> listaSubordinados = new ArrayList<Employee>();
	
	public Manage(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void print() {
		System.out.println(super.nome + ", $" + super.salario);
		
		for(Employee e : listaSubordinados) {
			e.print();
		}
		
	}

	@Override
	public void add(Employee e) {
		listaSubordinados.add(e);
		
	}

	@Override
	public void remove(Employee e) {
		listaSubordinados.remove(e);
		
	}

	@Override
	public List<Employee> getSubordinates() {
		return listaSubordinados;
	}
	
}
