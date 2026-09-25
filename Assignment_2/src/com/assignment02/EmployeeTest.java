package com.assignment02;

class Employee {

	private String first_name;
	private String last_name;
	private double monthly_salary;
	
	public Employee() {
		this.first_name = "";
		this.last_name = "";
		this.monthly_salary = 0.0;
	}
	
	
	public Employee(String first_name, String last_name, double monthly_salary) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.monthly_salary = monthly_salary;
	}

	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public double getMonthly_salary() {
		return monthly_salary;
	}


	public void setMonthly_salary(double monthly_salary) {
		if(monthly_salary > 0)
			this.monthly_salary = monthly_salary;
		
	}
	
	public double yearlySalary() {
		double yearly_salary = monthly_salary * 12;
		return yearly_salary;
	}
	
	public void displayRecord() {
		System.out.println("First Name: " + getFirst_name());
		System.out.println("Last Name: " + getLast_name());
		System.out.println("Monthly Salary: " + getMonthly_salary());
		System.out.println("Yearly Salary: " + yearlySalary());
	}
	
	
		
}

public class EmployeeTest{
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Himanshu", "Vinchukar", 700.00);
		Employee e2 = new Employee("Arnav", "Kumar", 500.00);
			
		e1.displayRecord();
		e2.displayRecord();
		
		System.out.println("\nBefore 10% Raise:");

        System.out.println(e1.getFirst_name() + " Yearly Salary: " + e1.yearlySalary());

        System.out.println(e2.getFirst_name() + " Yearly Salary: " + e2.yearlySalary());
		
		System.out.println("\nAfter 10% Raise:");

		System.out.println("Himanshu Yearly Salary: " + e1.yearlySalary());
		System.out.println("Arnav Yearly Salary: " + e2.yearlySalary());
		
		System.out.println("\nAfter 10% Raise:");

        System.out.println(e1.getFirst_name() + " Yearly Salary: " + e1.yearlySalary());

        System.out.println(e2.getFirst_name() + " Yearly Salary: " + e2.yearlySalary());
	}
}


