package org.anudip.hometask;
import java.util.Scanner;
public class SumOfPrimes {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        if (size <= 0) {
		            System.out.println("Invalid Input. Size should be a positive integer.");
		            return;
		        }

		        int[] array = new int[size];
		        System.out.println("Enter " + size + " elements for the array:");

		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        int sumOfPrimes = findSumOfPrimes(array);
		        if (sumOfPrimes == 0) {
		            System.out.println("No prime numbers present in the array.");
		        } else {
		            System.out.println("Sum of prime numbers in the array: " + sumOfPrimes);
		        }

		        scanner.close();
		    }

		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }

		        for (int i = 2; i * i <= number; i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }

		    public static int findSumOfPrimes(int[] array) {
		        int sum = 0;

		        for (int num : array) {
		            if (isPrime(num)) {
		                sum += num;
		            }
		        }

		        return sum;
		    }
		}



	


