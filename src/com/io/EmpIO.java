package com.io;

import java.io.IOException;
import java.util.List;

import com.pojo.Employee;

public interface EmpIO {
	 boolean addToFile(List<Employee> employe);
	 List<Employee> readFromFile();  
	 Employee readFromUser() ;
	 void displayToUser(Employee emp);
}
