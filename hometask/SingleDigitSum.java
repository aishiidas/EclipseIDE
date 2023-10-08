package org.anudip.hometask;
import java.util.Scanner;
public class SingleDigitSum {
	static long digitSum(long number)  
		{  
			return (1 + ((number - 1) % 9));  	}     
		//driver code  
		public static void main (String []args)  
		{ Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		String singleDigit=scanner.nextLine();
		if(singleDigit.length()<10) {
			System.out.println("Invalid Input");
		}
		else {
		long number=Long.parseLong(singleDigit);
		//declare a variable to count number of digits				
		System.out.println("The sum of digits is: "+digitSum(number));
				
		
	           }
    }

	}


