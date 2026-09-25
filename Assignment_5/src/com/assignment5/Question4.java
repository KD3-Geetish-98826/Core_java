package com.assignment5;

enum TrafficLight{
	RED(100),
	YELLOW(70),
	GREEN(20);
	
	private int duration;
	
	
	
	TrafficLight(int i) {
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
	
public class Question4 {

	public static void main(String[] args) {
		
		for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " light duration: " + light.getDuration() + " seconds");
        }
	
	}
}
