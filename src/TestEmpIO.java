
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.io.EmpIOImpl;
import com.io.EmpOperations;
import com.io.EmpOperationsImpl;
import com.pojo.Employee;
public class TestEmpIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmpIOImpl e=new EmpIOImpl();
		EmpOperationsImpl e1=new EmpOperationsImpl();
		Employee data=new Employee();
		while(true)
		{
			System.out.println("enter 1.addEmployee 2.Update 3.Delete 4.FindEMPbyId 5.findAllEmployees 6.exit");
			int op=sc.nextInt();
			switch(op)
			{
			case 1:
				data=e.readFromUser();
				e1.addEmployee(data);
				e.displayToUser(data);
				break;
			case 2:
				System.out.println("Please enter id for update request and name to be updated");
				System.out.println(e1.updateEmployee(sc.nextInt(), sc.next()));
				break;
			case 3:
				System.out.println("please enter id to be deleted");
				System.out.println(e1.deleteEmployee(sc.nextInt()));
				break;
			case 4:
				System.out.println("please enter id to be found");
				System.out.println(e1.findEmployeeById(sc.nextInt()));
				break;
			case 5:
				e1.findAllEmployees();
				break;
			case 6:
				System.exit(0);
			default:
					System.out.println("please enter valid option");
				
					
				
			}
		
	}

}
}
