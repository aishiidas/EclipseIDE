package org.anudip.application;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius of a circle:");
		double radius=Double.parseDouble(scanner.nextLine());
		Circle circle = new Circle(radius);
		double perimeter=circle.perimeterCalculation();
		double area=circle.areaCalculation();
		DecimalFormat myFormat = new DecimalFormat("0.00");
		String perimeterstr = myFormat.format(perimeter);
		String areastr = myFormat.format(area);
		System.out.println("Perimeter:"+perimeterstr);
		System.out.println("Area:"+areastr);
		scanner.close();

	}

}
