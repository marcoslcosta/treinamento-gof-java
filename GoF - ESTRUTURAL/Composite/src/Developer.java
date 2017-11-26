import java.util.List;

public class Developer extends Employee {

	public Developer(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println(super.nome + ", $" + super.salario);
		
	}

	@Override
	public void add(Employee e) {
		System.out.println("Não é possivel adicionar empregado subordinado do programador");
	}

	@Override
	public void remove(Employee e) {
		System.out.println("Não é possivel remover empregado subordinado do programador");
	}

	@Override
	public List<Employee> getSubordinates() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
