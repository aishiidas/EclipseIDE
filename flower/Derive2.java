package flower;

import fruit.Base;

public class Derive2 extends Base{
	private double j;
	public Derive2() {
		j = 3.75;
		System.out.println("Child Constructor");		
	}
	public void display() {
		show();
		System.out.println("The value of j: "+j);
	}

}
