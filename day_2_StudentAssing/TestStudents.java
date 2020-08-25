
public class TestStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] ob=new Student[7];

		ob[0]=new EnggStudent(1,"Ramya","CSE","RGUKT Basar");
		ob[1]=new EnggStudent(2,"Ramyagoud","CSE","RGUKT Basar");
		ob[2]=new EnggStudent(3,"Ramyajeevan","mmE","RGUKT Basar");
		ob[3]=new BscStudent(4,"Ravvena","CSE","RGUKT Basar");
		ob[4]=new BscStudent(5,"Rj","CSE","RGUKT Basar");
		ob[5]=new CommerceStudent(6,"Ramya","CSE","RGUKT Basar");
		ob[6]=new CommerceStudent(7,"Ramya","CSE","RGUKT Basar");
		for (Student var:ob)
		{
		System.out.println(var.toString());
	}
		
		Student s=new EnggStudent(1,"Ramya","CSE","RGUKT Basar");
		Student c=new CommerceStudent(10,"yum","gh"," Basar");
		if(search(ob,s))
			System.out.println("Avvailable");
		else
			System.out.println("not available");
		if(search(ob,c))
			System.out.println("Avvailable");
		else
			System.out.println("not Avvailable");
		
	}
public static boolean search(Student[] students,Student student)
{
	for(Student var:students)
	{
		if( var instanceof EnggStudent && student instanceof EnggStudent)
		{
			if(var.equals(student))
				return true;
		}
		else if( var instanceof CommerceStudent && student instanceof CommerceStudent)
		{
			if(var.equals(student))
				return true;
		}
		else if( var instanceof BscStudent && student instanceof BscStudent)
		{
			if(var.equals(student))
				return true;
		}	
	}
		return false;
}
	}

