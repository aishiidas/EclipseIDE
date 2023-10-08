package org.anudip.datetime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class DateDiff {

	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter your date of birth");
		String birthDate=scanner.nextLine();
		Date date=dateFormat.parse(birthDate);
		// convert into LocalDate object
		String str[]=birthDate.split("-");
		int dd=Integer.parseInt(str[0]);
		int mm=Integer.parseInt(str[1]);
		int yyyy=Integer.parseInt(str[2]);
		LocalDate myBirthDate=LocalDate.of(yyyy,mm,dd);
		LocalDate today=LocalDate.now();
		// age on today calculation
				Period period=Period.between(myBirthDate,today);
				System.out.println("Age in years:"+period.getYears());
				System.out.println("Age diff in months:"+period.getMonths());
				System.out.println("Age diff in days:"+period.getDays());
	}

}