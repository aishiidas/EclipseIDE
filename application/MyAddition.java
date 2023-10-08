package org.anudip.application;

public class MyAddition {
	public void addition(int x,int y) {
		int k = x+y;
		System.out.println("The result: "+k);
		System.out.println("int, int");
	}
	public int addition(int x,int y,int z) {
		int k = x+y+z;
		System.out.println("The result: "+k);
		System.out.println("int, int, int");
		return k;
	}
	public void addition(double x,double y) {
		double k = x+y;
		System.out.println("The result: "+k);
		System.out.println("double, double");
	}
	public void addition(double x,int y) {
		double k = x+y;
		System.out.println("The result: "+k);
		System.out.println("double, int");
	}
	public void addition(int x, double y) {
		double k = x+y;
		System.out.println("The result: "+k);
		System.out.println("int, double");
	}


}
