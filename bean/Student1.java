package org.anudip.bean;

public class Student1 {
	//member data
			private Integer rollNumber;// In industry,we should declared all the data types in wrapper class
			private String studentName;
			private String studentCourse;
			private Double studentMarks;
			private String studentGrade;
			public Student1() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Student1(Integer rollNumber, String studentName, String studentCourse, Double studentMarks,
					String studentGrade) {
				super();
				this.rollNumber = rollNumber;
				this.studentName = studentName;
				this.studentCourse = studentCourse;
				this.studentMarks = studentMarks;
				this.studentGrade = studentGrade;
			}
			public Integer getRollNumber() {
				return rollNumber;
			}
			public void setRollNumber(Integer rollNumber) {
				this.rollNumber = rollNumber;
			}
			public String getStudentName() {
				return studentName;
			}
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}
			public String getStudentCourse() {
				return studentCourse;
			}
			public void setStudentCourse(String studentCourse) {
				this.studentCourse = studentCourse;
			}
			public Double getStudentMarks() {
				return studentMarks;
			}
			public void setStudentMarks(Double studentMarks) {
				this.studentMarks = studentMarks;
			}
			public String getStudentGrade() {
				return studentGrade;
			}
			public void setStudentGrade(String studentGrade) {
				this.studentGrade = studentGrade;
			}
			@Override
			public String toString() {
				/*
				return "Student1 [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentCourse="
						+ studentCourse + ", studentMarks=" + studentMarks + ", studentGrade=" + studentGrade + "]";
			*/
				String output=String.format("%-5s %-15s %-10s %-5s %-5s",rollNumber,studentName,studentCourse,studentMarks,studentGrade);
				return  output;
				
			}

}
