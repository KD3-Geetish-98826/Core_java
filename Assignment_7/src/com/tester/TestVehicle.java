package com.tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle {

	Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		System.out.println("/nEnter the details of 2 Vehicles below");
		System.out.println();

		System.out.println("Enter the details of 1st Vehicle");
		System.out.print("Enter the Chasis No. : ");
		int chasisNo1 = sc.nextInt();
		System.out.print("Enter the Color : ");
		String color1 = sc.next();
		System.out.print("Enter the Price : ");
		double price1 = sc.nextDouble();

		Vehicle v1 = new Vehicle();

		System.out.println("Enter the details of 2nd Vehicle");
		System.out.print("Enter the Chasis No. : ");
		int chasisNo2 = sc.nextInt();
		System.out.print("Enter the Color : ");
		String color2 = sc.next();
		System.out.print("Enter the Price : ");
		double price2 = sc.nextDouble();

		Vehicle v2 = new Vehicle();

		if (v1.equals(v2)) {
			System.out.println("SAME");
		} else {
			System.out.println("DIFFERENT");
		}

	}

	public static void main(String[] args) {

		TestVehicle t = new TestVehicle();

		t.acceptRecord();
	}

}
