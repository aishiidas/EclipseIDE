package org.anudip.io;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileIn2 {
	public static void main(String[] args) throws IOException{
		// FileReader object points to file Lotus.txt in read mode
		FileInputStream fileIn=new FileInputStream("f:/lotus.txt");
		// BufferedReader will read from the file which fileReader is pointing to i.e Lotus.txt
		BufferedInputStream bufferedIn=new BufferedInputStream(fileIn);
		while (true) {
			int x=bufferedIn.read();
			if (x==-1) //-1 means End of file
				break;
			char ch=(char)x;
			System.out.print(ch);
		}
		fileIn.close();
		bufferedIn.close();
		}
}

