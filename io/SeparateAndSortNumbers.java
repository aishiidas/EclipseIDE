package org.anudip.io;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SeparateAndSortNumbers {
	public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[9];

        System.out.println("Enter 9 single-digit numbers:");

        for (int i = 0; i < 9; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            // Check if the input is a single-digit number
            if (numbers[i] < 0 || numbers[i] > 9) {
                System.out.println("Please enter a single-digit number (0-9).");
                i--;
            }
        }

        int[] oddNumbers = new int[9];
        int[] evenNumbers = new int[9];
        int oddCount = 0, evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenCount++] = number;
            } else {
                oddNumbers[oddCount++] = number;
            }
        }

        // Sort odd numbers in ascending order
        Arrays.sort(oddNumbers, 0, oddCount);

        // Sort even numbers in descending order
        Arrays.sort(evenNumbers, 0, evenCount);
        for (int i = 0; i < evenCount / 2; i++) {
            int temp = evenNumbers[i];
            evenNumbers[i] = evenNumbers[evenCount - i - 1];
            evenNumbers[evenCount - i - 1] = temp;
        }

        try {
            FileWriter oddWriter = new FileWriter("f:/odd.txt",true);
            FileWriter evenWriter = new FileWriter("f:/even.txt");

            for (int i = 0; i < oddCount; i++) {
                oddWriter.write(Integer.toString(oddNumbers[i]) + "\n");
            }

            for (int i = 0; i < evenCount; i++) {
                evenWriter.write(Integer.toString(evenNumbers[i]) + "\n");
            }

            oddWriter.close();
            evenWriter.close();

            System.out.println("Odd numbers saved to Odd.txt");
            System.out.println("Even numbers saved to Even.txt");
        } catch (IOException e) {
            System.err.println("An error occurred while writing the files.");
            e.printStackTrace();
        }

}
}