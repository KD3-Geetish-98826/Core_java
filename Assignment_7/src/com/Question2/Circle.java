package com.Question2;

class NonNegative extends Exception {
	public NonNegative(String message) {
		super(message);
	}
}

public class Circle {

	private double myX;
	private double myY;
	private double myDiameter;

	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;
	}

	public Circle(double myX, double myY, double myDiameter) {
		this.myX = myX;
		this.myY = myY;
		this.myDiameter = myDiameter;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws NonNegative {
		if (myDiameter < 0) {
			throw new NonNegative("Diameter cannot be negative!!");
		}
		this.myDiameter = myDiameter;
	}

}
