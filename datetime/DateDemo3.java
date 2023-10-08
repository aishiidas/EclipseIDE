package org.anudip.datetime;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
@SuppressWarnings("all")
public class DateDemo3 {
	public static void main(String[] args){
		LocalDate localDate=LocalDate.now();
		String str=localDate.toString();
		System.out.println("Before Formatting:"+str);
		String [] arr=str.split("-");
		int year=Integer.parseInt(arr[0]);
		year=year-1900;
		int month=Integer.parseInt(arr[1]);
		month = month - 1;
		int day=Integer.parseInt(arr[2]);
		Date date=new Date(year,month,day);
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		String output=dateFormat.format(date);
		System.out.println("After Formatting:"+output);
	}		
	
}