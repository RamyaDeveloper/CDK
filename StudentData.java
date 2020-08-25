import java.util.Scanner;

public class StudentData {
	public static void main(String[] args) {
		StudentMan manipulation=new StudentMan();
		Student1[] students=manipulation.create();
		for(Student1 var:students)
		{
			System.out.println("Name"+var.getName()+"Id"+var.getId()+"Age"+var.getAge());
			for(int i=0;i<var.getMarks().length;i++)
			{
				System.out.println(var.getMarks()[i]);
			}
		}
		System.out.println(students[2]);
	System.out.println(manipulation.total(students[2]));
	System.out.println(	manipulation.max(students));
		
	}

		
	}


