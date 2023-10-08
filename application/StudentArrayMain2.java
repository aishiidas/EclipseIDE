package org.anudip.application;
import java.util.Scanner;
import org.anudip.service.*;
public class StudentArrayMain2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		//ask the number of students' record to store
		System.out.println("Enter the number of students: ");
		int number=Integer.parseInt(scanner.nextLine());
		
		//Array declaration
		Student2 []stuArr=new Student2[number];
		
		//within loop 3 students details are accepted & stored in array
		for(int index =0; index<stuArr.length;index++) {
			int j=index+1;
			System.out.println("Enter Student no "+j+" details in (roll,name,course,marks) format :");
			String input=scanner.nextLine();
			String []inputArray=input.split(",");
			int roll=Integer.parseInt(inputArray[0]);
			double marks=Double.parseDouble(inputArray[3]);
			Student2 student = new Student2(roll,inputArray[1],inputArray[2],marks);
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
