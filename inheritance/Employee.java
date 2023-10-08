package org.anudip.inheritance;
import java.util.Scanner;
public abstract class Employee {
	private Integer employeeId;
	private String employeeName;
	private String deptName;
	public Employee() {
	this.employeeId = 0;
	this.employeeName="";
	this.deptName="";
}
	public void getdata() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Employee Id: ");
		employeeId = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter employee name:");
		employeeName=scanner.nextLine();
		System.out.println("Enter dept name:");
		deptName=scanner.nextLine();
		//scanner.close();
	}
	public void showdata() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("The dept name: "+deptName);
		
	}
	public void taxCalculation() {
		
		}
}