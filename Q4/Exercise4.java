package Labbook2q.Q4;

import java.util.Arrays;

public class Exercise4 {
	

	public static void main(String[] args) 
	{
		int[] a = { 1, 4, 5, 1 };
		Exercise4 ex = new Exercise4();
		Arrays.sort(a);
		int len = ex.modifyArray(a);
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(a[i]+" ");
		}

	}
	public int modifyArray(int[] a)
	{	int ma = 0;
		for (int i = 0; i < a.length-1; i++)
		{
			if (a[i] != a[i+1])
			{	a[ma] = a[i];
				ma++;
			}
		}
        a[ma++]=a[a.length-1];
		Arrays.sort(a);
		return ma;
	}

}
