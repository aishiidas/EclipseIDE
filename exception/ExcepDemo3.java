package org.anudip.exception;

import java.util.Scanner;

public class ExcepDemo3 {
	public static int performDivision(String x, String y) {
		int n=Integer.parseInt(x);
		int d=Integer.parseInt(y);
		int r=n/d;
		if(n<d)
			throw new NumeratorException();
		return r;
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter numerator :");
		String x = scanner.nextLine();
		System.out.println("Enter divisor :");
		String y= scanner.nextLine();
		int r = performDivision(x,y);
		System.out.println("The result:"+r);
		Thread.sleep(2000);
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
//		catch(InterruptedException ie) {
//			System.out.println("hello");
//		}
		finally {
			System.out.println("The application is over");
		}//end of finally
	}

}
