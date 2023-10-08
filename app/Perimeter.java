package org.anudip.app;
import java.util.Scanner;
public class Perimeter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the shape : ");	
		String menu=sc.nextLine();
		
		switch(menu) {
		 case "circle" : 
			 System.out.print("Enter the radius: ");
			 int r =Integer.parseInt(sc.nextLine());
			 int perimeter= 2*(22/7)*r;
			 System.out.println("Perimeter of circle : "+perimeter);
			 break;
		 case "square" : 
			 System.out.print("Enter the side: ");
			 int s =Integer.parseInt(sc.nextLine());
			 int perimeter1 = 4*s;
			 System.out.println("Perimeter of square : "+perimeter1);
			 break;
		 case "rectangle" : 
			 System.out.print("Enter the length: ");
			 int l =Integer.parseInt(sc.nextLine());
			 System.out.print("Enter the Base: ");
			 int b =Integer.parseInt(sc.nextLine());
			 int perimeter2 = 2*(l+b);
			 System.out.println("Perimeter of rectangle : "+perimeter2);
			 break;
		default:System.out.println("User entered invalid shape");	 
		}
		System.out.println("Program is close.");
		

		}

	}