package org.anudip.interfaceApp;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int radius = Integer.parseInt(sc.nextLine());
        Circle circle = new Circle(radius);

        System.out.println("Circle with radius " + radius);
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println("Area: " + circle.area());

	}

}
