package com.globallogic.app;

import com.globallogic.exception.InValidNameException;
import com.globallogic.exception.InvalidAgeException;
import com.globallogic.exception.NameNotNullException;
import com.globallogic.model.Employee;
import com.globallogic.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee = new Employee(111, "Kiran", "Development", 23);

		EmployeeService employeeService = new EmployeeService(employee);

		try {

			employeeService.validateEmployee();
			System.out.println(employee);

		} catch (NameNotNullException | InValidNameException | InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
