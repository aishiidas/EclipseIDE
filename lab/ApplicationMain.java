package org.anudip.lab;
import java.util.Scanner;
public class ApplicationMain {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of applicants: ");
	        int numApplicants = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character left by nextInt()
	        Applicant[] applicants = new Applicant[numApplicants];
	        // Accept applicant details
	        for (int i = 0; i < numApplicants; i++) {
	            System.out.print("Enter applicant details (Name, Subject1, Subject2, Subject3): ");
	            String input = scanner.nextLine();
	            String[] details = input.split(",");
	            if (details.length != 4) {
	                System.out.println("Invalid input format. Please enter in the correct format.");
	                i--;
	                continue;
	            }
	            String name = details[0].trim();
	            int subject1 = Integer.parseInt(details[1].trim());
	            int subject2 = Integer.parseInt(details[2].trim());
	            int subject3 = Integer.parseInt(details[3].trim());

	            if (subject1 < 0 || subject1 > 100 || subject2 < 0 || subject2 > 100 || subject3 < 0 || subject3 > 100) {
	                System.out.println("Invalid marks. Marks should be between 0 and 100 (inclusive).");
	                i--;
	                continue;
	            }
	            Applicant applicant = new Applicant(name, subject1, subject2, subject3);
	            int total = Applicant.totalCalculation(applicant);
	            int percentage = Applicant.percentageCalculation(total);

	            applicant.setTotal(total);
	            applicant.setPercentage(percentage);

	            applicants[i] = applicant;
	        }
	        scanner.close();
	        // Display passed applicants' details
	        System.out.println("\nPassed Applicants:");
	        System.out.println(String.format("%-10s %-5s %-5s %-5s %-10s %-10s", "Name", "Sub1", "Sub2", "Sub3", "Total", "Percentage"));
	        for (Applicant applicant : applicants) {
	            if (applicant.getPercentage() >= 70) {
	                System.out.println(applicant);
	            }
	        }
		    }//end of main
		}//end of class


