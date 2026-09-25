package com.tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class Showroom {
	
	private String chasisNo;
	private String color;
	private String category;
	private double price;
	private Date manufactureDate;
	
	public Showroom() {
		// TODO Auto-generated constructor stub
	}
	
	public Showroom(String chasisNo, String color, String category, double price, Date manufactureDate) {
		this.chasisNo = chasisNo;
		this.color = color;
		this.category = category;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	public static Scanner sc = new Scanner(System.in);
	ArrayList<Vehicle> list = new ArrayList<>();
	
	public static int menuList() {
		System.out.println("1. Add Vehicle");
		System.out.println("2. Display All Vehicles");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		int choice;
		while ((choice = menuList()) != 3) {
			switch (choice) {
			case 1:
				
				break;
			case 2:
				
				break;

			default:
				System.out.println("Invaid Choice");
				break;
			}
			
		}

	}

}
