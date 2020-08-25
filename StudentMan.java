
public class StudentMan {	
	
	public Student1[] create()
	{
		Student1[] students=new Student1[5];
		students[0]=new Student1("ram",1,2,new int[] {1,2});
		students[1]=new Student1("ram",3,4,new int[] {1,6});
		students[2]=new Student1("ram",8,2,new int[] {1,9});
		students[3]=new Student1("ram",1,2,new int[] {1,10});
		students[4]=new Student1("ram",1,2,new int[] {1,11});
		return students;
	}
public  int total(Student1 student)
 {
	int sum=0;
	for(int i=0;i<student.getMarks().length;i++)
	{
		sum+=student.getMarks()[i];
 }
	return sum;
 }
 int max(Student1 students[])
 {
	StudentMan s=new StudentMan();
	int max=-999;
	for(Student1 ob:create())
	{
		if(max<s.total(ob));
		max=s.total(ob);	
	}
	return max;
 }
	
}
