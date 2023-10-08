package org.anudip.inheritance;
import java.util.Scanner;
public class ParmanentEmployee extends Employee{
	private double monthlySalary;
	public ParmanentEmployee() {
		monthlySalary = 0.0;
	}
	public void getdata() {
		super.getdata();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter employee monthly salary:");
		monthlySalary=Double.parseDouble(scanner.nextLine());
		//scanner.close();
	}
	public void showdata() {
		super.showdata();
		System.out.println("The employee monthly salary:"+monthlySalary);
	}
	public void taxCalculation() {
	double annualSalary = monthlySalary*12;
	double taxAmount = annualSalary*0.1;
	System.out.println("The tax value: "+taxAmount);
	}
}
