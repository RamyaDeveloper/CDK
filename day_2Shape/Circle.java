
public class Circle extends Shape implements Calculation {
int radius;
	@Override
	public double perimter() {
	
		return 3.14*2*radius;
	}

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	public Circle()
	{
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

}
