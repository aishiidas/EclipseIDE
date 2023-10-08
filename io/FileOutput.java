package org.anudip.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileOutput {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		//FileWriter object points to file Lotus.txt in append mode
		FileWriter fileWriter=new FileWriter("f:/lotus.txt",true);
		//BufferedWriter will write inside the file which fileWriter is pointing to i.e Lotus.txt
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		//accept data from user
		System.out.println("Enter a text:");
		String str=scanner.nextLine();
		//BufferedWriter transfer to content to the File
		bufferedWriter.write(str);
		bufferedWriter.flush();
		bufferedWriter.newLine();
		bufferedWriter.close();
		fileWriter.close();
		scanner.close();
		System.out.println("File written");	
	}
}
