
public class BscStudent extends Student {
private String specialization;
private String collegeName;
public BscStudent(int roll_no, String name, String specialization, String collegeName) {
	super(roll_no, name);
	this.specialization = specialization;
	this.collegeName = collegeName;
}
public BscStudent()
{
	
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

public String toString() {
	return  super.toString()+ collegeName +"\t"+ specialization;
}
public boolean equals(Object o)
{
	BscStudent com=(BscStudent) o;
	 super.equals(com);
	if( com.getSpecialization().equals(this.getSpecialization())&&com.getCollegeName().equals(this.getCollegeName()))
	return true;
	else
		return false;
	
	
}
}
