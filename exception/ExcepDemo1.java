package org.anudip.exception;
import java.util.Scanner;
public class ExcepDemo1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	try {
	System.out.println("Enter numerator :");
	int n=Integer.parseInt(scanner.nextLine());
	System.out.println("Enter divisor :");
	int d=Integer.parseInt(scanner.nextLine());
	int r=n/d;
	System.out.println("The result:"+r);
	int arr[] = {10,20,30,40,50};
	System.out.println(arr[6]);
	}//end of try
	catch(ArithmeticException ne) {
		System.out.println("Devided by Zero not possible");
	}//end of catch
	catch(NumberFormatException ne) {
		System.out.println("Input must be a whole number");
	}//end of catch
	catch(Exception ex) {
		System.out.println("Some Error.....");
	}
	finally {
		System.out.println("The application is over");
	}//end of finally
	}
}
