
public class CommerceStudent extends Student{
	private String major_subject;
	private String college_name;
	public CommerceStudent()
	{
		
	}
	public String getMajor_subject() {
		return major_subject;
	}
	public void setMajor_subject(String major_subject) {
		this.major_subject = major_subject;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	
	public CommerceStudent(int roll_no, String name, String major_subject, String college_name) {
		super(roll_no, name);
		this.major_subject = major_subject;
		this.college_name = college_name;
	}
	public String toString() {
		return  super.toString()+ college_name +"\t"+major_subject;
	}
	public boolean equals(Object o)
	{
		CommerceStudent co=(CommerceStudent) o;
		 super.equals(co);
		if( co.getMajor_subject().equals(this.getMajor_subject())&&co.getCollege_name().equals(this.getCollege_name()))
		return true;
		else
			return false;
		
		
	}
}
