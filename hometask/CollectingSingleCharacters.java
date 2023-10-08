package org.anudip.hometask;
import java.util.Scanner;
import java.util.TreeSet;
public class CollectingSingleCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String result = collectSingleCharacters(inputString);
        System.out.println("Single characters in ascending order: " + result);
    }

    public static String collectSingleCharacters(String inputString) {
        TreeSet<Character> singleCharacters = new TreeSet<>();

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch) && inputString.indexOf(ch) == inputString.lastIndexOf(ch)) {
                singleCharacters.add(ch);
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (char ch : singleCharacters) {
            resultBuilder.append(ch);
        }

        return resultBuilder.toString();

	}

}
