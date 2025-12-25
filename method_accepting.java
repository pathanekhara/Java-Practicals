package Practice;

public class method_accepting 
{
	public void demo(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(arr);
	}
	
	public int sumArray(int arr[])
	{
		int sum=0;
		for(int i:arr)
			sum+=i;
		return sum;
	}
	
	public int sumOfEvenArray(int arr[]){
		{
			int sum=0;
			for(int i:arr)
				if(i%2==0) sum+=i;
			return sum;
		}
	}

	public static void main(String[] args) 
	{
		method_accepting m=new method_accepting();
		int arr[]= {10,20,30,40,50};
		m.demo(arr);
		System.out.println(m.sumArray(arr));
		System.out.println(m.sumOfEvenArray(arr));
		
	}
}
