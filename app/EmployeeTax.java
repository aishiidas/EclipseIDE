package org.anudip.app;
import java.util.Scanner;
public class EmployeeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String x = sc.nextLine();
		System.out.println("Enter Annual Income: ");
		double y = Double.parseDouble(sc.nextLine());
		double tax = 0;
		if(y<=250000) {
			tax=0;
		}
		else if(y<=500000) {
			tax = (y-250000)*0.1;
		}
		else if (y<=1000000) {
			tax=((y-500000)*0.2)+30000;
		}
		else {
			tax=((y-1000000)*0.3)+50000;
		}
		System.out.println("The name of the employee is: "+x);
		System.out.println("The Tax is: "+tax);
		

	}

}
