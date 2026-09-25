package com.optional;

import java.util.Scanner;

public class Question1 {

	public static void main() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter the beginning balance: ");
		int beginningBalance = sc.nextInt();
		System.out.println("Enter the chargers: ");
		int charges = sc.nextInt();
		System.out.println("Enter the total credits: ");
		int credits = sc.nextInt();
		System.out.println("Enter the credit limit: ");
		int creditLimit = sc.nextInt();
		
		int newBalance = beginningBalance + charges - credits;
		
		if (newBalance > creditLimit) {
			System.out.println("Credit limit exceeded");
		} else {
			System.out.println("Credit limit exceeded");
		}
	}
	
}
