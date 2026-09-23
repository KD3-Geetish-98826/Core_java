package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	static Scanner sc = new Scanner(System.in);

	 public static int menuList() {
		
		System.out.println("\n0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket");
		System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
				
		System.out.print("Enter size of basket: ");
		int n = sc.nextInt();
		Fruit[] basket = new Fruit[n];
		
		int counter = 0;
		int choice;
		
		while ((choice = menuList())!= 0) {
			switch (choice) {
			case 1:
				if(counter >= basket.length) {
					System.out.println("\nBasket is full");
				}else {
					System.out.print("Enter the name: ");
			        String name = sc.next();
			        
			        System.out.print("Enter the weight: ");
			        double weight = sc.nextDouble();

			        System.out.print("Enter the color: ");
			        String color = sc.next();
			        
					basket[counter++] = new Mango(name, weight, color);
				}
				break;
			case 2:
				if(counter >= basket.length) {
					System.out.println("\nBasket is full");
				}else {
					System.out.print("Enter the name: ");
			        String name = sc.next();

			        System.out.print("Enter the weight: ");
			        double weight = sc.nextDouble();

			        System.out.print("Enter the color: ");
			        String color = sc.next();
			        
					basket[counter++] = new Orange(name, weight, color);
				}
				break;
			case 3:
				if(counter >= basket.length) {
					System.out.println("\nBasket is full");
				}else {
					System.out.print("Enter the name: ");
			        String name = sc.next();

			        System.out.print("Enter the weight: ");
			        double weight = sc.nextDouble();

			        System.out.print("Enter the color: ");
			        String color = sc.next();
			        
					basket[counter++] = new Apple(name, weight, color);
				}
				break;
			case 4:
				for (Fruit fruit : basket) {
					if(fruit != null) {
						System.out.println("Fruit Name: " + fruit.getName());
					}
				}
				break;
			case 5:
				for(Fruit fruit: basket) {
					if(fruit != null && fruit.isFresh()) {
						System.out.println(fruit.toString());
						System.out.println(fruit.taste());
					}
				}
				break;
			case 6:
				for(Fruit fruit: basket) {
					if(fruit != null && !fruit.isFresh()) {
						System.out.println(fruit.taste());
					}
				}
				break;
			case 7:
				System.out.print("Enter fruit index: ");
				int index = sc.nextInt();
				if(index < 0 || index >= basket.length || basket[index] == null) {
					System.out.println("Invalid index");
				}else {
					basket[index].setFresh(false);
					System.out.println("Fruit marked as stale successfully.");
				}
				break;
			case 8:
				for(Fruit fruit: basket) {
					if(fruit.taste().equals("Sour")) {
						fruit.setFresh(false);
						System.out.println("Fruit marked as stale to all sour taste fruits.");
					}
				}
				break;
			default:
				System.out.println("Invalid output");
				break;
			}
		}

	}

}
