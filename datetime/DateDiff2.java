package org.anudip.datetime;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDiff2 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter your date of birth");
		String birthDate=scanner.nextLine();
		LocalDate myBirthDate=LocalDate.parse(birthDate, dateFormat);
		LocalDate today=LocalDate.now();
		// age on today calculation
				Period period=Period.between(myBirthDate,today);
				System.out.println("Age in years:"+period.getYears());
				System.out.println("Age diff in months:"+period.getMonths());
				System.out.println("Age diff in days:"+period.getDays());
				scanner.close();
	}

}