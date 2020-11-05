package com.cg.eis.bean;
/*
 * Author : Sai Chaitanya Krishna
 * Date :29-10-2020
 * Description : Employee class which holds the employee details
 */
public class Employee {
	/**
	 * Employee id
	 */
	private int id;
	/**
	 * Employee name
	 */
	private String name;
	/**
	 * Employee Salary
	 */
	private double salary;
	/**
	 * Employee designation
	 */
	private String designation;
	/**
	 * Employee insurance scheme
	 */
	private String insuranceScheme;
	/**
	 * Getters and setters for the employee details
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
