package org.anudip.datetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateDemo4 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Befor Formatting: "+localDate);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String output = dateFormat.format(localDate);
		System.out.println("After Formatting: "+output);

	}

}
