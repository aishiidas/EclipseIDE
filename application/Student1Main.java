package org.anudip.application;
import java.util.Scanner;
import org.anudip.bean.Student1;
public class Student1Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Accept Student Details
		System.out.println("Enter Student Roll: ");
		int roll = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter Student Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Student Course: ");
		String course = scanner.nextLine();
		System.out.println("Enter Student Marks: ");
		double marks = Double.parseDouble(scanner.nextLine());
		System.out.println("Enter Student Grade: ");
		String grade = scanner.nextLine();
		Student1 student = new Student1(roll,name,course,marks,grade);
		System.out.println(student);
		scanner.close();

	}

}
