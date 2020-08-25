
public class Square extends Shape implements Calculation {

	int side;
	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
public Square()
{
	
}
	@Override
	public double perimter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
