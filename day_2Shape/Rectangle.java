
public class Rectangle extends Shape implements Calculation {

	int len,breadth;
	public Rectangle(String name, int len, int breadth) {
		super(name);
		this.len = len;
		this.breadth = breadth;
	}
public Rectangle()
{
	
}
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double perimter() {
		// TODO Auto-generated method stub
		return 2*len*breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return len*breadth;
	}

}
