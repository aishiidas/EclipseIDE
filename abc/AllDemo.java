package abc;

public class AllDemo {
	private int i;
	private static int j;
	public AllDemo() {
		super();
		//i=10;
		System.out.println("This is constructor of AllDemo");
		}//end of constructor
	{
		i=15;
		System.out.println("It is instance block");
	}
	static {
		j =20;
		System.out.println("It is static block");
	}
	public void show() {
		System.out.println("The value of i: "+i);
	}
	public static void display() {
		System.out.println("The value of j: "+j);
	}

}
