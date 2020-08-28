package com.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;

public class EmpIOImpl implements EmpIO {

	@Override
	public boolean addToFile(List<Employee> employe) {
		
		try(FileOutputStream fo=new FileOutputStream("employee.txt");
				ObjectOutputStream oo=new ObjectOutputStream(fo))
				{
			for(Employee var:employe)
			oo.writeObject(var);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Employee> readFromFile() {
		List<Employee> employees=new ArrayList<>();
		try
			(FileInputStream empfile=new FileInputStream("employee.txt");
			ObjectInputStream oi=new ObjectInputStream(empfile);)
			{
			if(empfile.available()==0)
			{	return employees;
			}
			while(empfile.available()!=0)
			{Object o=oi.readObject();	
			Employee emp=(Employee) o;
			employees.add(emp);}	
			}
			 catch (FileNotFoundException|ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();} 
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee readFromUser() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		//List<Employee> employees=new ArrayList<Employee>();
		System.out.println("please enter address 1.city 2.state 3.pincode");
		Address address=new Address(sc.next(),sc.next(),sc.next());
		System.out.println("please enter 1.empid 2.empname");
		Employee employee=new Employee (sc.nextInt(),sc.next(),address);	 
		return employee;
	}

	@Override
	public void displayToUser(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println(emp);

	}

}
