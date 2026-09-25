package com.app.geometry;

import java.util.Scanner;

public class Point2D {

    private double x;
    private double y;
    
    public Point2D() {
    	
    }
    
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x coordinate : ");
		x = sc.nextDouble();
		System.out.println("Enter the y coordinate : ");
		y = sc.nextDouble();
	}
	
	public String getDetails() {
		return "Co-ordinate [x = " + x + " , y = " + y + "]";
	}

	public boolean isEqual(Point2D p2) {
		return this.x == p2.x && this.y == p2.y;
	}
	
    public double calculateDistance(Point2D other) {
    	
    	double x = other.x - this.x;
    	double y = other.y - this.y;
    	
    	return Math.sqrt(
    			Math.pow(x, 2) + Math.pow(y, 2)
      			);
    	
    }
    

}