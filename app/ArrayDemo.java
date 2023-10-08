package org.anudip.app;
import java.util.Arrays;
public class ArrayDemo {

	public static void main(String[] args) {
		int []arr = {60,23,57,89,54,92,73,49};
		System.out.println("The size of the arrays= "+arr.length);
		System.out.println("Display: ");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("Display after sort in ascending order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Display after sort in descending order: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
