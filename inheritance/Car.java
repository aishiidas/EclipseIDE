package org.anudip.inheritance;

public class Car extends Vehicle {
	public String color;
	public Car() {
		color="Black";
	}
	public void honk() {
        System.out.println(" The color of the car is : "+color);
    }
}
