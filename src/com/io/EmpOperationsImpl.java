package com.io;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmpOperationsImpl implements EmpOperations {
	EmpIOImpl  impl1=new EmpIOImpl ();
	List<Employee> employees=new ArrayList<>();
	@Override
	public boolean addEmployee(Employee employee) {
		
		
		 employees=impl1.readFromFile();
		employees.add(employee);
		impl1.addToFile(employees);
			return true;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		 employees=impl1.readFromFile();
		 for(Employee var:employees)
		 {
			 if(var.getEmpid()==id)
			 {	 var.setName(name);		
			 return var;
		 }
		 }
		 impl1.addToFile(employees);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employees=impl1.readFromFile();
		 for(Employee var:employees)
		 {
			 if(var.getEmpid()==id)
			 {	 employees.remove(var);	
			 impl1.addToFile(employees);
			 return var;
		 }
		 }
		 
		return null;
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		employees=impl1.readFromFile();
		 for(Employee var:employees)
		 {
			 if(var.getEmpid()==id)
			 	 
			 return var;
		 }
		return null;
	}

	@Override
	public void findAllEmployees() {
		// TODO Auto-generated method stub
		employees=impl1.readFromFile();
		 for(Employee var:employees)
		 {
			System.out.println(var);
		 }
	}

}
