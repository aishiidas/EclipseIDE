package org.anudip.exception;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class VoterEnrollment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the date of birth (DD-MM-YYYY): ");
            String dobString = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dob = LocalDate.parse(dobString, formatter);

            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(dob, currentDate);
            int age = period.getYears();

            if (age < 1 || age > 150) {
                throw new AgeException("Wrong age. Age must be between 1 and 150.");
            } else if (age < 18) {
                throw new VoterException("UHGS! Invalid age for enrollment as a voter.");
            } else {
                System.out.println("Congratulations! You are Eligible for voter enrollment.");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("The Application is Over");
        }

	}

}
