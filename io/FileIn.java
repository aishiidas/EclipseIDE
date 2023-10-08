package org.anudip.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileIn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// FileReader object points to file Lotus.txt in read mode
				FileReader fileReader=new FileReader("f:/lotus.txt");
				// BufferedReader will read from the file which fileReader is pointing to i.e Lotus.txt
				BufferedReader bufferedReader=new BufferedReader(fileReader);
				while (true) {
					String str=bufferedReader.readLine();
					//EOF bufferedReader will return null value
					if(str==null)
						break;
					System.out.println(str);
				}
				fileReader.close();
				bufferedReader.close();

	}

}
