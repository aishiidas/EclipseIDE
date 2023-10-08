package org.anudip.bean;
import java.util.Scanner;
public class MyEmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        MyEmployee[] employees = new MyEmployee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Employee Name: ");
            String employeeName = scanner.nextLine();

            System.out.print("Employee Street Address: ");
            String street = scanner.nextLine();

            System.out.print("Employee City: ");
            String city = scanner.nextLine();

            System.out.print("Employee PIN: ");
            int pin = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Employee Department Name: ");
            String deptName = scanner.nextLine();

            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left by nextDouble()

            Address empAddress = new Address(street, city, pin);
            MyEmployee employee = new MyEmployee(employeeId, employeeName, empAddress, deptName, salary);
            employees[i] = employee;
        }

        scanner.close();

        System.out.println("\nEmployee Details:");
        System.out.println(String.format("%-5s %-10s %-20s %-15s %-10s %-10s %-10s", "ID","Name","Street Address","city","pin","Dept","Salary"));

        for (MyEmployee employee : employees) {
            System.out.println(employee);
        }


	}

}
