package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;


public class TestPoint {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x1: ");
		double x1 = sc.nextDouble();

		System.out.print("Enter y1: ");
		double y1 = sc.nextDouble();

		System.out.print("Enter x2: ");
		double x2 = sc.nextDouble();

		System.out.print("Enter y2: ");
		double y2 = sc.nextDouble();
		
		Point2D pd1 = new Point2D(x1,y1);
		Point2D pd2 = new Point2D(x2,y2);
		
		System.out.println("Point 1: " + pd1.getDetails());
		System.out.println("Point 2: " + pd2.getDetails());
		
		if (pd1.isEqual(pd2)) {

		    System.out.println("Both points are at the same position, So distance is 0.");

		} else {

			System.out.println("Points are different.");
			
			double distance  = pd1.calculateDistance(pd2);
			
			System.out.println("Distance = " + distance);

		}
		
	
	}

}
