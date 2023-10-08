package org.anudip.interfaceApp;

public class Circle implements Shape {
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

	@Override
	public String perimeter() {
		double perimeter = 2 * pi * radius;
        return String.format("%.2f", perimeter);
	}

	@Override
	public String area() {
		double area = pi * radius * radius;
        return String.format("%.2f", area);
	}

}
