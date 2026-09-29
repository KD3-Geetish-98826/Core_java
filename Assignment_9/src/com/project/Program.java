package com.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.student.details.Student;
import com.utils.SortByCost;

public class Program {

	public static Scanner scanner = new Scanner(System.in);

	public static int menuList() {

		System.out.println("\nEnter 0 to Exist");
		System.out.println("Enter 1 to Add Dummy Data of Projects in the Set");
		System.out.println("Enter 2 to Input a Project from user and add in Set");
		System.out.println("Enter 3 to Display all Projects in Set");
		System.out.println("Enter 4 to Delete a Project by Id from Set");
		System.out.println("Enter 5 to Copy All Projects from Set to ArrayList");
		System.out.println("Enter 6 to Display all Projects from List");
		System.out.println("Enter 7 to Sort all Projects in List by cost");
		System.out.println("Enter 8 to get the Max team");
		System.out.print("\nEnter your choice: ");

		return scanner.nextInt();

	}

	public static void main(String[] args) {

		int choice;

		Set<Project> projects = new HashSet<>();
		
		List<Project> projects2 = new ArrayList<>(projects);

		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:

				int id;
				String title;
				int teamSize;
				Double projectCost;
				String technology;

				projects.add(new Project(1, "Train Reservation System", 5, 1000000, "Java"));
				projects.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
				projects.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
				projects.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
				projects.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
				projects.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
				System.out.println("Added dummy data in set Sucessfully!!");

				break;

			case 2:

				System.out.print("\nEnter the Project ID: ");
				id = scanner.nextInt();
				scanner.nextLine(); // for space entry in the input
				System.out.print("Enter the Project Title: ");
				title = scanner.next(); 
				System.out.print("Enter the Project Team Size: ");
				teamSize = scanner.nextInt();
				System.out.print("Enter the Project Project Cost: ");
				projectCost = scanner.nextDouble();
				System.out.print("Enter the Project Technology: ");
				technology = scanner.next();

				projects.add(new Project(id, title, teamSize, projectCost, technology));

				break;

			case 3:
				System.out.println("Display all Projects");
				for (Project p : projects) {
					System.out.println(p.toString());
				}
				System.out.println();
				break;

			case 4:
				System.out.print("Enter the Id to delete the project: ");
				int id1 = scanner.nextInt();
				
				Project found = null;
				for(Project p : projects ) {
					if(p.getId() == id1) 
						found = p;
				}
				
				if(found != null) {
					projects.remove(found);
					System.out.println("Project removed sucessfully!! ");
				}else {
					System.out.println("Invalid ID!!");
				}
					
				break;
			case 5:		
				
				System.out.println("\nCopy All Projects from Set to ArrayList Successfully!!");
				System.out.println();
				
				break;
				
			case 6:
				
				for(Project p: projects2) {
					System.out.println(p.toString());
				}
			case 7:
				projects2.sort(new SortByCost());
				System.out.println("Sorted Sucessfully!!");
				
				for(Project p2: projects) {
					System.out.println(p2.toString());
				}
				
				break;
				
			case 8:
				Project maxProject = Collections.max(
						projects,(p1,p2) -> Integer.compare(p1.getTeamSize(), p2.getTeamSize()));
				System.out.println(maxProject);
				break;
				
				
			default:
				break;
			}
		}

	}

}
