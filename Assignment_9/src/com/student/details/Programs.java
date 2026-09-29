package com.student.details;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.utils.SortByMarks;
import com.utils.SortByName;
import com.utils.SortByRollNo;

public class Programs {

	static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println();
		System.out.println("Enter 0 to Exit the code");
		System.out.println("Enter 1 to Add the Student");
		System.out.println("Enter 2 to Display All the Students");
		System.out.println("Enter 3 to Search the Student");
		System.out.println("Enter 4 to Sort the Students on Rollno");
		System.out.println("Enter 5 to Sort the Students on Name");
		System.out.println("Enter 6 to Sort the Students on Marks");
		System.out.print("\nEnter your Choice: ");

		return scanner.nextInt();
	}

	public static void main(String[] args) {

		int choice;

		List<Student> students = new ArrayList<>();

		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				System.out.println();
				System.out.print("Enter the Student's Roll No. : ");
				int rollno = scanner.nextInt();
				scanner.nextLine(); // consume leftover Enter
				System.out.print("Enter the Student's Name : ");
				String name = scanner.nextLine();
				System.out.print("Enter the Student's Marks : ");
				double marks = scanner.nextDouble();

				students.add(new Student(rollno, name, marks));
				System.out.println("\nStudent details Added Successfully!!");

				break;
			case 2:

				ListIterator<Student> trav = students.listIterator();

				System.out.println("\nAll Students Details:\n");
				for (Student s : students) {
					System.out.println(s.toString());
				}
				System.out.println();

				break;
			case 3:

				System.out.print("\nEnter the Roll No.: ");
				int roll = scanner.nextInt();

				for (Student s1 : students) {
					if (s1.getRollno() == roll) {
						System.out.println(s1.toString());
					}
				}

				break;
			case 4:

				students.sort(new SortByRollNo());
				System.out.println("\nStudent's Details are Sort by Rollno.: \n");

				for (Student s2 : students) {
					System.out.println(s2.toString());
				}

				break;
			case 5:

				students.sort(new SortByName());
				System.out.println("\nStudent's Details are Sort by Student's Name: \n");

				for (Student s3 : students) {
					System.out.println(s3.toString());
				}

				break;
			case 6:

				students.sort(new SortByMarks());
				System.out.println("\nStudent's Details are Sort by Marks: \n");

				for (Student s4 : students) {
					System.out.println(s4.toString());
				}

				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		}

	}

}
