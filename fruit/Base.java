package fruit;

public class Base {
	private int i;
	public Base() {
		i=10;
		System.out.println("Parent Constructor");
	}
	protected void show() {
		System.out.println("The value of i id: "+i);
	}

}
