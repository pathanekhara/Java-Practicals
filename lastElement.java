package Practice;

import java.util.Arrays;

public class lastElement 
{
	public static int[] LastElement(int arr[])
	{
	for(int i=0;i<arr.length;i++)
	{
		int last=arr[i]%10;
		arr[i]=last;	
	}
	return arr;
	}
	
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		int ar[]= {12,34,54,123,35,12,34};
		int res[]=LastElement(ar);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		System.out.println(Arrays.toString(LastElement(ar)));
		
	}
}
