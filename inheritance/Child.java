package org.anudip.inheritance;

public class Child extends Parent{
	private double j;
	public Child() {
		j = 3.75;
		System.out.println("Child Constructor");		
	}
	public void display() {
		System.out.println("The value of j: "+j);
	}

}
