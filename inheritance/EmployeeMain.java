package org.anudip.inheritance;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = null;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. Permanent Employee");
			System.out.println("2. Contract Employee");
			System.out.println("3. Exit");
			System.out.println("Choice(1-3): ");
			String choice = scanner.nextLine();
			switch(choice) {
			case "1": emp = new ParmanentEmployee(); break;
			case "2":emp = new ContractEmployee(); break;
			case "3": System.exit(0);
			}//end of switch
			emp.getdata();
			emp.showdata();
			//emp.tacCalculation();
		}//end of loop

	}

}
