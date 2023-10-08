package org.anudip.application;

public class Student {
	//member data
		private Integer rollNumber;// In industry,we should declared all the data types in wrapper class
		private String studentName;//if there is no constructor means default constructor present then instance variable of that class initialize to
		private String studentCourse;//byte,int,short,long--0, float,double--0.0, boolean--false, char--" ",
		private Double studentMarks;//String--null,infact all object are initialize to null including wrapper class object
		private String studentGrade;
		
		//member functions
		public void setData(Integer rollNumber ,String studentName, String studentCourse, Double studentMarks ) {
			this.rollNumber =rollNumber;
			this.studentName=studentName;    
			this.studentCourse=studentCourse;
			this.studentMarks=studentMarks;
		//  instance variable  local variable
		}
		
		//member functions
		public void showData() {
			System.out.println("Roll: "+rollNumber);
			System.out.println("Name: "+studentName);
			System.out.println("Course: "+studentCourse);
			System.out.println("Marks: "+studentMarks);
			System.out.println("Grade: "+studentGrade);	
		}
		
		//member functions
		public void calculateGrade() {
			if(studentMarks>=90)
				studentGrade="E";
			else if(studentMarks>=75)
				studentGrade="G";
			else if(studentMarks>=60)
				studentGrade="P";
			else
				studentGrade="F";
		}
	}

