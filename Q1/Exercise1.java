package Labbook2q.Q1;

import java.util.Scanner;

public class Exercise1 {
	
	public int secondLargest(int[] arr) 
	{
		int large = Integer.MIN_VALUE;
		int sl = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (large < arr[i]) {
				sl = large;
				large = arr[i];
			}
			else if (arr[i] > sl && arr[i] != large)
			{
				sl = arr[i];
			}
		}

		return sl;
	}
    
	//Driver 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		Exercise1 ex = new Exercise1();
		System.out.println("second largest num is: " + ex.secondLargest(arr));
		sc.close();
	}

}
