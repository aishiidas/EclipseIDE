package org.anudip.exception;
import java.util.Scanner;
public class VoterEnrollmentApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the age of the person: ");
            int age = Integer.parseInt(scanner.nextLine());

            if (age < 1 || age > 150) {
                throw new AgeException("Wrong age. Age must be between 1 and 150.");
            } else if (age < 18) {
                throw new VoterException("Invalid age for enrollment as a voter.");
            } else {
                System.out.println("Eligible for voter enrollment.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter a valid age.");
        }//end of catch
        catch (AgeException ex) {
            System.out.println("AgeException: " + ex.getMessage());
        } //end of catch
        catch (VoterException ex) {
            System.out.println("VoterException: " + ex.getMessage());
        }//end of catch
        finally {
        	System.out.println("The Application is Over");
        }//end of finally
scanner.close();
	}//end of main

}//end of class
