package com.Exception.Question1;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception{

	public ExceptionLineTooLong() {
		super("The string is too long! ");
	}
}


public class Question1 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			String str = sc.nextLine();
			
			int length = str.length();
			
			if(length > 80) {
				throw new ExceptionLineTooLong();
			}
			
		} catch (ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
	}

}
