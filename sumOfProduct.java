package Practice;

import java.util.Arrays;

public class sumOfProduct
{
	public static int[] sumofproduct(int arr[])
	{
		int index=0;
		for(int num:arr)
		{
			int sum=0,product=1;
			while(num!=0)
			{
				sum=sum+(num%10);
				product=product*(num%10);
				num/=10;
			}
			arr[index++]=sum*product;
		}
		return arr;
	}

	public static void main(String[] args)
	{
		int arr[]= {12,34,54,123,35,12,34};
		System.out.println(Arrays.toString(sumofproduct(arr)));
		
		
	}

}
