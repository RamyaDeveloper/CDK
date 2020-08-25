
public class Student {
	private int roll_no;
	private String name;
	public Student(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}
	
	
	public String toString() {
		//System.out.println(e.getStream()+e.getCollegeName());
		return roll_no+"\t"+name;
	}
	public Student()
	{
		
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public boolean equals(Object o)
{
	Student s=(Student) o;
	
	if(s.getRoll_no()==this.getRoll_no() && s.getName().equals(this.getName()))
		return true;
	else
		return false;
}
}
