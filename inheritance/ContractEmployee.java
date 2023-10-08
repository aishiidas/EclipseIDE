package org.anudip.inheritance;
import java.util.Scanner;
public class ContractEmployee extends Employee {
	private Integer contractPeriod;
	private Double contractAmount;
	public ContractEmployee() {
		super();
		contractPeriod = 0;
		contractAmount = 0.0;
	}
	public void getdata() {
		super.getdata();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Contract Period:");
		contractPeriod=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter Contract Amount:");
		contractAmount=Double.parseDouble(scanner.nextLine());
		//scanner.close();
	}
	public void showdata() {
		super.showdata();
		System.out.println("The Contract Period:"+contractPeriod);
		System.out.println("The Contract Amount:"+contractAmount);
}
	public void taxCalculation() {
		double annualIncome = contractAmount/contractPeriod;
		double taxAmount = annualIncome*0.1;
		System.out.println("The tax value: "+taxAmount);
		}
}
