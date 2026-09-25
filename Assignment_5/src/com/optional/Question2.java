package com.optional;

import java.util.Scanner;

public class Question2 {

	
	public static void daily_driving_cost(double total_miles_per_day, double cost_per_gallon, double avg, double parking_ticket, double tolls) {
		double total_cost_per_day = (((total_miles_per_day / avg ) * cost_per_gallon) + parking_ticket + tolls) ;
		System.out.println("\nYour daily driving cost is : "+ total_cost_per_day);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total miles driven per day: ");
		double total_miles_per_day = sc.nextDouble();
		System.out.print("Enter the Cost per gallon of gasoline: ");
		double cost_per_gallon = sc.nextDouble();
		System.out.print("Enter the Average miles per gallon: ");
		double avg = sc.nextDouble();
		System.out.print("Enter the Parking fees per day: ");
		double parking_ticket = sc.nextDouble();
		System.out.print("Enter the Cost of Tolls per day: ");
		double tolls = sc.nextDouble();
		
		daily_driving_cost(total_miles_per_day, cost_per_gallon, avg, parking_ticket, tolls);
			
		
	}
}
