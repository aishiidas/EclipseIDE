package org.anudip.application;
import java.util.Scanner;
import org.anudip.service.*;
public class StudentArrayMain {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		//Array declaration
		Student2 []stuArr=new Student2[3];
		//within loop 3 students details are accepted & stored in array
		for(int index =0; index<stuArr.length;index++) {
			System.out.println("Enter Student roll:");
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
			stuArr[index]=student;
			}//end of for loop
		
		String headings=String.format("%-5s %-15s %-10s %-5s %-5s","Roll","Name","Course","Marks","Grade");
		System.out.println(headings);
		
		//display all Students records from array
		for(Student2 std:stuArr) {
			System.out.println(std);
			
		}
		scanner.close();

	}

}
