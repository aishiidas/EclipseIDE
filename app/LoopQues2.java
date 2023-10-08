package org.anudip.app;
import java.util.Scanner;
public class LoopQues2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int x= Integer.parseInt(sc.nextLine());
		int n1=0, n2=1, n3=0, i;
		System.out.println("Fibonacci Series of " +x);
		System.out.print(n1);
		for(i=1;i<=x;i++){
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.print(" "+n3);
		}

	}

}
