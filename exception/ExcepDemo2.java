package org.anudip.exception;

import java.util.Scanner;

public class ExcepDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter numerator :");
		int n=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter divisor :");
		int d=Integer.parseInt(scanner.nextLine());
		int r=n/d;
		if(n<d) {
			throw new NumeratorException();
		}
		System.out.println("The result:"+r);
		}//end of try
		catch(ArithmeticException ne) {
			System.out.println("Devided by Zero not possible");
		}//end of catch
		catch(NumberFormatException ne) {
			System.out.println("Input must be a whole number");
		}//end of catch
		catch(NumeratorException ne) {
			System.out.println("Numerator can not be lesser than divisior");
		}//end of catch
		catch(Exception ex) {
			System.out.println("Some Error.....");
		}
		finally {
			System.out.println("The application is over");
		}//end of finally
	}

}
