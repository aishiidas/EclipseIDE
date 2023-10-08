package org.anudip.datetime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateDemo1 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		// pattern for date input
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter batch start date (dd-mm-yyyy):");
		String startDate=scanner.nextLine();
		//validate the date
		Date batchDate=dateFormat.parse(startDate);
		System.out.println(batchDate);
		//System.out.println(startDate);		
	}
}