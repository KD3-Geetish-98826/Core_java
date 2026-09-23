package com.assignment5;

import java.util.Scanner;

import javax.swing.event.MenuListener;

public class Question1 {
	
	
	static int menuList() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Using built in method ");
		System.out.println("2.Using manual method ");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
		
	}
	
	static void builtIn() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String str1 = sc.next();
		System.out.println("Before reverse: " + str1);
		
		String str2 = new StringBuilder(str1).reverse().toString();
		System.out.println("After reverse: " + str2);
		
	}
	
	static void manualMethod()  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String str1 = sc.next();
		System.out.println("Before reverse: " + str1);
		
		String str2 = "";
		
		for(int i = str1.length() - 1; i>=0; i--) {
			str2 += str1.charAt(i);
		}
		
		System.out.println("After reverse: " + str2);
		
	}
	public static void main(String[] args) {
		
	int choice;
	while((choice = menuList())!=0) {
		switch (choice) {
		case 1:
			builtIn();
			break;
		case 2:
			manualMethod();
			break;
		default:
			System.out.println("Invaid choice");
			break;
		}
		
	}
	}
	
}
