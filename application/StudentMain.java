package org.anudip.application;
import java.util.Scanner;
public class StudentMain {

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
		
		//Declare student object
		Student student = new Student();
		//pass the input to student object
		student.setData(roll,name,course,marks);
		//calculate the grade
		student.calculateGrade();
		//display student details
		student.showData();
		scanner.close();
		
		//System.out.println(student.rollNumber);//we can't access private fields into the another class
		//access modifiers--> are the tools to achieve abstraction
	}

}
