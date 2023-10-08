package org.anudip.application;
import java.util.Scanner;
import org.anudip.service.Student2;
import org.anudip.service.StudentService;
public class StudentServiceMain {

	public static void main(String[] args) {
		/*
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
		Student2 student=new Student2(roll,name,course,marks);
		String grade=StudentService.calculateGrade(student);
		student.setStudentGrade(grade);
		System.out.println(student);
		*/
		
		//(short process)
		 Scanner scanner = new Scanner(System.in);
		 //Accept student details
		  System.out.println("Enter Student details (roll,name,course,marks) format :");
		  String input = scanner.nextLine();
		  String []inputArray=input.split(",");
		  int roll=Integer.parseInt(inputArray[0]);
		  double marks=Double.parseDouble(inputArray[3]);
		  Student2 student = new Student2(roll,inputArray[1],inputArray[2],marks);
		  String grades=StudentService.calculateGrade(student);
		  student.setStudentGrade(grades);
		  System.out.println(student);
		  scanner.close();

	}

}
