package org.anudip.application;

public class Circle {
	private double radius;
	public Circle(Double radius) {
		super();
		this.radius = radius;
	}
	public Double perimeterCalculation() {
		double perimeter=2*3.1416*radius;
		return perimeter;
	}
	public Double areaCalculation() {
		double area=3.1416*radius*radius;
		return area;
	}

}
