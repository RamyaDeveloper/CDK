import java.util.*;
import java.lang.*;
class Employee{
	 private int empno;
	private  double salary;
	 private String empname;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpname() {
		return empname;
	}
	
	
	
}
public class Employ_Info {
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee e1[]=new Employee[2];
		for (int i=0;i<e1.length;i++)
		{
			System.out.println("Print employee"+i+"details");
			/*try{empno=sc.nextInt();
			salary=sc.nextDouble();
			empname=sc.next();*/
			e1[i]=new Employee();
			e1[i].setEmpno(sc.nextInt());
			e1[i].setSalary(sc.nextDouble());
			e1[i].setEmpname(sc.next());
			
		}
		for (int i=0;i<e1.length;i++)
		{
			System.out.println("Print employee"+(i+1)+"details");
				
			System.out.println("Employeee  "+(i+1)+ "emp num is "+e1[i].getEmpno());
			System.out.println("Employeee  "+(i+1)+"salary is  "+e1[i].getSalary());
			System.out.println("Employeee "+(i+1)+"empname is "+e1[i].getEmpname());
			System.out.println(Arrays.toString(e1));
			
		
		}	
		
	}

}
