package com.cg.eis.service;

import com.cg.eis.bean.Employee;
/*
 * Author : Sai Chaitanya Krishna
 * Date :29-10-2020
 * Description : Employee class which holds the employee details
 */
public interface EmployeeService {
		/*
		 * Methods to be implemented in Service class
		 */
		public void getEmployeeDetails(Employee employee);

		public String FindInsuranceDetails(double salary);

		public void displayDetails(Employee employee);

	}
