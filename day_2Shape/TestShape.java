
public class TestShape {

	public static void main(String[] args) {
		
		Calculation circle=new Circle("Circle",2);
	
		Calculation rectangle=new Rectangle("RECTNGLE",4,5);
		Calculation square=new Square("Square",8);
		System.out.println("Area of circle"+circle.area());
		System.out.println("p of circle"+circle.perimter());
		System.out.println("Area of rectangle"+rectangle.area());
		System.out.println("perimtr of rectngle"+rectangle.area());
		System.out.println("Area of square"+square.area());
		System.out.println("perimtr of square"+square.perimter());
		
	}

}
