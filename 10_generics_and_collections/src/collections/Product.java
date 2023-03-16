package collections;

//POJO
public class Product{

	private int id;
	private String name;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	/*
	@Override
	public boolean equals(Object obj) {

		//rule: if id's are the same, objects are the same
		
		if(this.id== ((Product)obj).getId()) {
			return true;
		}
		
		return false;
	}
	
	*/
	
	
	@Override
	public boolean equals(Object obj) {

		
		return Integer.valueOf(id).equals(((Product)obj).getId());
		
		
	}
	
	//return a different int for different instances
	@Override
	public int hashCode() {
		return id;
	}
	
}
