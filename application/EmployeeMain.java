package org.anudip.application;
import java.util.Scanner;
import org.anudip.bean.Employee;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of employee entry:");
		int no =Integer.parseInt(scanner.nextLine());
		Employee [] empArr=new Employee[no];
		for(int i =0; i<no;i++) {
			System.out.println("Enter Employee details in (name,dept,salary) format: ");
			String emp =scanner.nextLine();
			String []arr = emp.split(",");
			Employee employee = new Employee(arr[0],arr[1],Double.parseDouble(arr[2]));
			empArr[i]=employee;
			}
		//display
		for(Employee em:empArr) {
			System.out.println(em);
		}
		scanner.close();

	}

}
