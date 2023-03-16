package generics;

public class TypeBox<T,E> {

	private T var;
	private E eVar;
	
	public E geteVar() {
		return eVar;
	}
	
	public void seteVar(E eVar) {
		this.eVar = eVar;
	}
	
	public T getVar() {
		return var;
	}
	
	public void setVar(T var) {
		this.var = var;
	}
}
