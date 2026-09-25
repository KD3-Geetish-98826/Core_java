package com.app.geometry;

import java.util.Scanner;

public class question02 {
		
	private int account_number;
	private int balance_beginning;
	private int total_int;
	private int total_all_credits;
	private int credit_limits;
	
	public question02() {
		
	}
	
	public question02(int account_number, int balance_beginning, int total_int, int total_all_credits, int credit_limits) {
		this.account_number = account_number;
		this.balance_beginning = balance_beginning;
		this.total_int = total_int;
		this.total_all_credits = total_all_credits;
		this.credit_limits = credit_limits;
	}

	
	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getBalance_beginning() {
		return balance_beginning;
	}

	public void setBalance_beginning(int balance_beginning) {
		this.balance_beginning = balance_beginning;
	}

	public int getTotal_int() {
		return total_int;
	}

	public void setTotal_int(int total_int) {
		this.total_int = total_int;
	}

	public int getTotal_all_credits() {
		return total_all_credits;
	}

	public void setTotal_all_credits(int total_all_credits) {
		this.total_all_credits = total_all_credits;
	}

	public int getCredit_limits() {
		return credit_limits;
	}

	public void setCredit_limits(int credit_limits) {
		this.credit_limits = credit_limits;
	}
	
	public int new_balance() {
		int new_balance = balance_beginning + total_int - credit_limits ;
		return new_balance;
	}
	
	public void check_credit_limit() {
		if( new_balance() > getCredit_limits()) {
			System.out.println("\nCredit limit exceeded");
		} else {
			System.out.println("\nCredit is less than the limit");
		}
	}
	
	public void disply() {
		System.out.println("Account Number is : " + account_number);
		System.out.println("The balance at the beginning of the month is : " + balance_beginning);
		System.out.println("The total of all items charged by the customer this month is : " + total_int);
		System.out.println("The total of all credits applied to the customer’s account this month is : " + total_all_credits);
		System.out.println("The allowed credit limit is : " + credit_limits);
	}


	public static void main(String[] args) {
		
		question02 q = new question02();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the account number : ");
		Integer account_number = sc.nextInt();
		q.setAccount_number(account_number);
		
		System.out.print("Enter the balance at the beginning of the month : ");
		Integer balance_beginning = sc.nextInt();
		q.setBalance_beginning(balance_beginning);
		
		System.out.print("Enter the total of all items charged by the customer this month : ");
		Integer total_int = sc.nextInt();
		q.setTotal_int(total_int);
		
		System.out.print("Enter the total of all credits applied to the customer’s account this month : ");
		Integer total_all_credits = sc.nextInt();
		q.setTotal_all_credits(total_all_credits);
		
		System.out.print("Enter the allowed credit limit: ");
		Integer credit_limits = sc.nextInt();
		q.setCredit_limits(credit_limits);
		
		
		q.disply();
		System.out.print("\nThe new Balance is : " + q.new_balance() );
		q.check_credit_limit();
		
	}

}
