package com.greenhorn.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.greenhorn.spring.model.Employee;

public class EmployeeService {
	
	Employee employee; //
    
	public List<Employee> empList = null;

	public void addEmployee() {
		empList = new ArrayList<Employee>();
		empList.add(getEmployee());
	}
	
	public Employee getEmp(){
		Employee e = null ;
		for(Employee emp : empList ) {
			e = emp;
		}
		return e;
	}

	// Utility code
	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
