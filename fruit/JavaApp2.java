package fruit;
import java.util.*;
public class JavaApp2 {

	public static void main(String[] args) {
		//circle area and perimeter
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int radius = Integer.parseInt(sc.nextLine());
		double pi = 2 * 3.1416 * radius;
		System.out.println("Perimeter of circle is : "+pi);
		double area = 3.1416 * radius * radius;
		System.out.println("Area os circle is: "+area);
		
		
		//celsious into fahrenheit
		System.out.println("Enter Celsious Value: ");
		double celsious = Double.parseDouble(sc.nextLine());
		double Fahrenheit = (celsious * 9/5) + 32;
		System.out.println("Fahrenheit Value Is : "+Fahrenheit);
	
	}

}
