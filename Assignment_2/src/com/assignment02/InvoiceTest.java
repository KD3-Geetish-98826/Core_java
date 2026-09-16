package com.assignment02;

import java.util.Scanner;

class Invoice {

	private String part_number;
	private String part_description;
	private int item;
	private double price_per_item;
	
	public Invoice() {
		String part_number = "";
		String part_description = "";
		int item = 0;
		double price_per_item = 0.0;
	}
	
	
	public Invoice(String part_number, String part_description, int item, double price_per_item) {
		this.part_number = part_number;
		this.part_description = part_description;
		
		
	}


	public String getPart_number() {
		return part_number;
	}


	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}


	public String getPart_description() {
		return part_description;
	}


	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}


	public int getItem() {
		return item;
	}


	public void setItem(int item) {
		 if (item > 0)
	            this.item = item;
	        else
	            this.item = 0;
	}


	public double getPrice_per_item() {
		return price_per_item;
	}


	public void setPrice_per_item(double price_per_item) {
		if (price_per_item > 0)
            this.price_per_item = price_per_item;
        else
            this.price_per_item = 0.0;
	}


}
public class InvoiceTest {
	Invoice i = new Invoice();
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the part number: ");
		String part_number = sc.next();
		i.setPart_number(part_number);
		
		System.out.print("Enter the part_description: ");
		String part_description = sc.next();
		i.setPart_description(part_description);
		
		System.out.print("Enter the item(Quantity): ");
		int item = sc.nextInt();
		i.setItem(item);
		
		System.out.print("Enter the Price Per Item: ");
		double price_per_item = sc.nextDouble();
		i.setPrice_per_item(price_per_item);
	}

	public void displayRecord() {
		System.out.println("Part Number: " + i.getPart_number());
		System.out.println("Part Description: " + i.getPart_description());
		System.out.println("Item: " + i.getItem());
		System.out.println("Price per item: " + i.getPrice_per_item());
	}
	
	public double invoice_amount() {
		double result;
		result = (i.getItem() * i.getPrice_per_item()) ;
		return result;
	}
	public static void main(String[] args) {
		
		InvoiceTest i2 = new InvoiceTest();
		i2.acceptRecord();
		i2.displayRecord();
		System.out.println("Invoice Amount: " + i2.invoice_amount());
		
		
		
	}

}
