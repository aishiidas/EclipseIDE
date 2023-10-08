package org.anudip.app;
import java.util.Scanner;
public class StudentPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int x= Integer.parseInt(sc.nextLine());
		if(x>=90) {
		System.out.println("Grade is: E ");	
		}
		else if(x>=75) {
			System.out.println("Grade is: V ");	
			}
		else if(x>=60) {
			System.out.println("Grade is: G ");	
			}
		else if(x>=50) {
			System.out.println("Grade is: P ");	
			}
		else{
			System.out.println("Grade is: F ");	
			}		
	}

}
