package org.anudip.inheritance;

public class Student extends Person {
	private String grade;
	public Student() {
		grade = "A";
	}
	public void study() {
		System.out.println("Grade is : "+grade);
	}

}
