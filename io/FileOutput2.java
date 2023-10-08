package org.anudip.io;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileOutput2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//FileWriter object points to file Lotus.txt in append mode
		FileOutputStream fileOut=new FileOutputStream("f:/tulip.txt",true);
		BufferedOutputStream bufferedOut=new BufferedOutputStream(fileOut);
		//accept data from user
		System.out.println("Enter a text:");
		String str="\n"+scanner.nextLine();
		// converting from String to byte
		byte [] byteArr=str.getBytes();	
		bufferedOut.write(byteArr);
		bufferedOut.flush();
		bufferedOut.close();
		fileOut.close();		
		scanner.close();
		System.out.println("File written");	
	}
}


