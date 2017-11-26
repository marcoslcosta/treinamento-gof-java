
public abstract class Professor {

	public final Implementador imp; 
	public Professor(Implementador imp)
	{
		this.imp = imp;
	}
	
	public abstract void op();
	
}
