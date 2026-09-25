package com.assignment5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String str = sc.nextLine();
		
		
		 String str1 = str.trim(); 
		 String[] str2 = str1.split(" ");
		 
		 
		int str3 = str.length();
		
		System.out.println("Count: " + str3);
 	}
	
}
