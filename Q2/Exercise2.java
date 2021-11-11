package Labbook2q.Q2;

import java.util.Scanner;

public class Exercise2 {
	
	static void sortStrings(String[] arr, int n) {
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < n / 2; k++) {
			System.out.print(arr[k].toUpperCase());
		}
		for (int k = n / 2; k < n; k++) {
			System.out.print(arr[k].toLowerCase());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		

		String[] arr1 = new String[size];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter String in the array at position" + i);
			arr1[i] = sc.next();
		}
		sortStrings(arr1, size);
		
	}

}
