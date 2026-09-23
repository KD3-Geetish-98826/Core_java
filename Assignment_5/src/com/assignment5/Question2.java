package com.assignment5;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String str1 = sc.next();
		
		String str2 = "";
		
		for(int i = str1.length() - 1; i>=0; i--) {
			str2 += str1.charAt(i);
		}
		
		int res = str1.compareToIgnoreCase(str2);
		
		if(res ==  0 )
			System.out.println("palindrome");
		else {
			System.out.println("not palindrome");
		}
		
	}
}
