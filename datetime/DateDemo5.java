package org.anudip.datetime;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateDemo5 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter batch start date (dd-mm-yyyy):");
		String startDate =scanner.nextLine();
		// pattern for date input
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//validate the date
		LocalDate batchDate= LocalDate.parse(startDate, dateFormat);
		System.out.println(batchDate);
	}
}