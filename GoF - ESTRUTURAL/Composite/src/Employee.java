import java.util.List;

public abstract class Employee {

	public String nome;
	public double salario;
	
	public Employee(String nome, double salario)
	{
		this.nome = nome;
		this.salario = salario;
	}


	public abstract void print();
	
	public abstract void add(Employee e);
	
	public abstract void remove(Employee e);
	
	public abstract List<Employee> getSubordinates();
	
	
	
	
	
	
}
