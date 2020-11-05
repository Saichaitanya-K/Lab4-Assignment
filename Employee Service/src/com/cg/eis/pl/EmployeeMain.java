package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.Service;
/*
 * Author : Sai Chaitanya Krishna
 * Date :29-10-2020
 * Description : EmployeeMain class for giving menu selection and invoking methods
 */
public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * Creating object for Employee and EmployeeService class
		 */
		Employee employee = new Employee();
		EmployeeService serv = new Service();
		Scanner sc = new Scanner(System.in);
		int n = 1;
		/*
		 * Menu for operations to perform
		 */
		while (n > 0) {
			System.out.println("1)Give User Information");
			System.out.println("2)Get Insurance Scheme & Display the Details");
			System.out.println("3)Exit");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			/*
			 * Invoking methods according to the choice
			 */
			switch (choice) {

			case 1:
				serv.getEmployeeDetails(employee);
				break;
			case 2:
				serv.displayDetails(employee);
				break;
			case 3:
				System.out.println("Thanks for using Employee Service");
				n = 0;
				break;
			default:
				System.out.println("Choose from 1,2,3!");
			}
		}
		sc.close();

	}

}

