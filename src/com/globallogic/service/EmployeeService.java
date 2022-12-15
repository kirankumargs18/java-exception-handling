package com.globallogic.service;

import com.globallogic.exception.InValidNameException;
import com.globallogic.exception.InvalidAgeException;
import com.globallogic.exception.NameNotNullException;
import com.globallogic.model.Employee;

public class EmployeeService {

	private Employee employee;

	public EmployeeService(Employee employee) {
		super();
		this.employee = employee;
	}

	public void validateEmployee() throws NameNotNullException, InValidNameException, InvalidAgeException {

		if (employee.getName().length() == 0) {
			throw new NameNotNullException("Name can't be null");
		}

		if (employee.getName().length() < 3) {
			throw new InValidNameException("name should have minimum 3 chararcters");
		}

		if (employee.getAge() < 22) {
			throw new InvalidAgeException("Age shoul be minimum 23");
		}

	}

}
