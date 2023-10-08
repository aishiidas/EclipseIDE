package org.anudip.app;
import java.util.Scanner;
public class ArrayQ1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];

	        
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter number at index " + i + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        System.out.println("Even numbers in the array:");
	        boolean evenNumberFound = false;
	        for (int number : numbers) {
	            if (number % 2 == 0) {
	                System.out.println(number);
	                evenNumberFound = true;
	            }
	            else {
	            	System.out.println("No even number found");
	            }
	       

	       // if (evenNumberFound==false) {
	           // System.out.println("No even number found");
	      //  }

	}

	}
}
