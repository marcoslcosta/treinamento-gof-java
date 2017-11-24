
public abstract class NotaMusical implements Cloneable {

	public NotaMusical Clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (NotaMusical) clone;
	}
	
	public abstract void desenha();
}
