package org.anudip.hometask;
import java.util.Scanner;
public class SubString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String st = scanner.nextLine();
        int cutPoint = 5;
        int numbersOfCharacters = 5;

        String result = extractSubString(st, cutPoint, numbersOfCharacters);
        System.out.println("Output: " + result);
    }

    public static String extractSubString(String myString, int cutPoint, int numbersOfCharacters) {
        int endIndex = Math.min(cutPoint + numbersOfCharacters, myString.length());
        return myString.substring(cutPoint, endIndex);

	}

}
