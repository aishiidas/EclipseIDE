package org.anudip.datetime;
import java.time.LocalDate;
public class LocalDateDemo{

	public static void main(String[] args) {
		LocalDate Id=LocalDate.now();
		System.out.println(Id);
		LocalDate Id2=Id.plusDays(3);
		System.out.println(Id2);
		LocalDate Id3=Id.plusDays(3);
		System.out.println(Id3);
		LocalDate Id4=LocalDate.of(2023, 06, 29);
		System.out.println(Id4);
	}

}