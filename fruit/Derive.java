package fruit;

public class Derive extends Base{
	private double j;
	public Derive() {
		j = 3.75;
		System.out.println("Child Constructor");		
	}
	public void display() {
		show();
		System.out.println("The value of j: "+j);
	}

}
