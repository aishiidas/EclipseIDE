package org.anudip.lab;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	 public static boolean checkAnagram(String string1, String string2) {
	        // Convert both strings to lowercase and remove spaces
	        String formattedString1 = string1.toLowerCase().replaceAll("\\s", "");
	        String formattedString2 = string2.toLowerCase().replaceAll("\\s", "");
	        // Check if the lengths of the strings are equal
	        if (formattedString1.length() != formattedString2.length()) {
	            return false;
	        }
	        // Convert the strings to character arrays and sort them
	        char[] charArray1 = formattedString1.toCharArray();
	        char[] charArray2 = formattedString2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        // Compare the sorted arrays
	        return Arrays.equals(charArray1, charArray2);
	    }
	 public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the two strings
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        // Check if the strings are anagrams
        boolean result = checkAnagram(string1, string2);
        // Display the result
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
	}//end of main
}//end of class
