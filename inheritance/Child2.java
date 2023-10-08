package org.anudip.inheritance;

public class Child2 extends Parent2 {
	private double j;
	public Child2() {
		j = 3.75;
		System.out.println("Child Constructor");		
	}
	public void show() {
		super.show();
		System.out.println("The value of j: "+j);
	}

}
