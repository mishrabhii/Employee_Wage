package com.employeeWage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		int full_Time = 1;
		double EmpCheck = Math.floor(Math.random()*10)%2;

		double WagePerHour = 20;
		double PartTimeHours=8;
		double PartTimeWork = PartTimeHours*WagePerHour;
		if (EmpCheck == full_Time) 
			System.out.println("Employee Worked Part Time and Wage is = " +PartTimeWork);
		else
			System.out.println("Employee is absent");
	}			
}




