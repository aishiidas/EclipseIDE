package org.anudip.lab;
public class Applicant {
	 private String name;
	    private Integer subject1;
	    private Integer subject2;
	    private Integer subject3;
	    private Integer total;
	    private Integer percentage;
	    public Applicant() {
	    }
	    public Applicant(String name, Integer subject1, Integer subject2, Integer subject3) {
	        this.name = name;
	        this.subject1 = subject1;
	        this.subject2 = subject2;
	        this.subject3 = subject3;
	        this.total = 0;
	        this.percentage = 0;
	    }
	    // Getters and Setters
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public Integer getSubject1() {
	        return subject1;
	    }
	    public void setSubject1(Integer subject1) {
	        this.subject1 = subject1;
	    }
	    public Integer getSubject2() {
	        return subject2;
	    }
	    public void setSubject2(Integer subject2) {
	        this.subject2 = subject2;
	    }
	    public Integer getSubject3() {
	        return subject3;
	    }
	    public void setSubject3(Integer subject3) {
	        this.subject3 = subject3;
	    }
	    public Integer getTotal() {
	        return total;
	    }
	    public void setTotal(Integer total) {
	        this.total = total;
	    }
	    public Integer getPercentage() {
	        return percentage;
	    }
	    public void setPercentage(Integer percentage) {
	        this.percentage = percentage;
	    }
	    // Method to calculate total marks and return 0 if any subject's mark is below 50
	    public static int totalCalculation(Applicant applicant) {
	        if (applicant.getSubject1() < 50 || applicant.getSubject2() < 50 || applicant.getSubject3() < 50) {
	            return 0;
	        }
	        return applicant.getSubject1() + applicant.getSubject2() + applicant.getSubject3();
	    }
	    // Method to calculate percentage
	    public static int percentageCalculation(int total) {
	        return (total * 100) / 300;
	    }
	    @Override
	    public String toString() {
	        return String.format("%-10s %-5s %-5s %-5s %-10s %-10s",
	                name, subject1, subject2, subject3, total, percentage);
	    }
	}//end of class
