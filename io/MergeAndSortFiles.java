package org.anudip.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MergeAndSortFiles {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read numbers from file1.txt
        readNumbersFromFile("odd.txt", numbers);

        // Read numbers from file2.txt
        readNumbersFromFile("even.txt", numbers);

        // Sort the numbers in ascending order
        Collections.sort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers in ascending order:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void readNumbersFromFile(String filename, ArrayList<Integer> numbers) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                numbers.add(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

