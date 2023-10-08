package org.anudip.app;
import java.util.Scanner;
public class LoopQues1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int x= Integer.parseInt(sc.nextLine());
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+x+" is: " +fact);

	}

}
