package org.anudip.hometask;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        if (size < 3) {
		            System.out.println("Invalid Input. Size should be at least 3.");
		            return;
		        }

		        int[] array = new int[size];
		        System.out.println("Enter " + size + " elements for the array:");

		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		            if (array[i] <= 0) {
		                System.out.println("Invalid Input. Elements should be greater than 0.");
		                return;
		            }
		        }

		        int sumOfHighestAndLowest = findSumOfHighestAndLowest(array);
		        System.out.println("Sum of the highest and lowest inputs: " + sumOfHighestAndLowest);

		        scanner.close();
		    }

		    public static int findSumOfHighestAndLowest(int[] array) {
		        int highest = array[0];
		        int lowest = array[0];

		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > highest) {
		                highest = array[i];
		            }

		            if (array[i] < lowest) {
		                lowest = array[i];
		            }
		        }

		        return highest + lowest;
		    }
		}




