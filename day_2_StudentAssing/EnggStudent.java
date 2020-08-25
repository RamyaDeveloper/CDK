
public class EnggStudent extends Student {
	
	private String collegeName;
	private String stream;
	public EnggStudent(int roll_no, String name, String collegeName, String stream) {
		super(roll_no, name);
		this.collegeName = collegeName;
		this.stream = stream;
	}
	public EnggStudent()
	{
		
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		//System.out.println(super.toString()+ collegeName + stream);
		return   super.toString()+ collegeName + "\t"+stream;
	}
	
	public boolean equals(Object o)
	{
		 EnggStudent e=(EnggStudent) o;
		 super.equals(e);
		if( e.getStream().equals(this.getStream())&&e.getCollegeName().equals(this.getCollegeName()))
		return true;
		else
			return false;
		
		
	}
	
	

}
