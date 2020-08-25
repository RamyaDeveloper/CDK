import java.util.*;
	import java.lang.*;
public class Student1 {
	
	String name;
	int id;
	int age;
	int marks[]=new int[2];
	Student1(String name,int id,int age,int[] marks)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.marks=marks;	
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

		
		
}
