package org.anudip.inheritance;

public class Vehicle {
	private String brand;
	private String model;
	private int year;
	public Vehicle() {
		brand = "Audi";
		model="Audi A4";
		year= 2023;
	}
	public void drive() {
        System.out.println("The car brand : "+brand+ "model is: " + model + " and Year" + year );
	}

}
