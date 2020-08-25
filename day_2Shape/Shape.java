
public class Shape {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape(String name) {
		super();
		this.name = name;
	}
	public Shape()
	{
		
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
}
