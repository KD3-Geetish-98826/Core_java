package com.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

import com.util.SortByPrice;

public class Program {

	public static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println();
		System.out.println("0. Exit");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Sort all books (by price in desc order)");
		System.out.println();
		System.out.print("Enter your choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		ArrayList<Library> list = new ArrayList<>();

		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("\nEnter the no. of books to be added : ");
				int n = sc.nextInt();

				for (int i = 0; i < n; i++) {
					System.out.println("\nEnter the details of the books " + (i + 1));

					System.out.print("Enter the isbn code : ");
					String isbn = sc.next();
					System.out.print("Enter the price of the book : ");
					double price = sc.nextDouble();
					sc.nextLine(); // consume leftover newline
					System.out.print("Enter the Authors Name: ");
					String authorName = sc.nextLine();
					System.out.print("Enter the quantity: ");
					int quantity = sc.nextInt();

					list.add(new Library(isbn, price, authorName, quantity));
				}
				System.out.println("\nAdded new books Successfully");
				break;
			case 2:

				ListIterator<Library> trav = list.listIterator();
				while (trav.hasNext()) {
					Library ele = trav.next();
					System.out.println(ele + " ");
				}
				System.out.println();

				break;
			case 3:

				ListIterator<Library> pTrav = list.listIterator(list.size());
				while (pTrav.hasPrevious()) {
					Library ele = pTrav.previous();
					System.out.println(ele + ", ");
				}
				System.out.println();

				break;
			case 4:

				System.out.print("Enter index of book to delete: ");
				int index = sc.nextInt();
				if (index >= 0 && index < list.size()) {
					list.remove(index);
					System.out.println("Removed sucessfully!");
				} else {
					System.out.println("Invalid index");
				}
				break;
			case 5:
				list.sort(new SortByPrice());
				System.out.println("Sorted successfully!, Now choose option to 2 view the sorted list");
				break;

			default:
				System.out.println("Invalid Choice ");
				break;
			}
		}

	}

}
