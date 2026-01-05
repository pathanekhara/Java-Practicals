package Practice;
public class Smith 
{
	public static int sumOfEachDigit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
	return sum;
	}

	public static int sumOfPrimeFactor(int num)
	{
		 int sum=0;
		    for(int i=2;i<=num;i++)
		    { 
		    	while(num%i==0)
		    	{
		        sum+=sumOfEachDigit(i);
		        num/=i;
		    }
		    }
		    return sum;
	}
	
	public static String checkSmith(int num)
	{
		return sumOfEachDigit(num) == sumOfPrimeFactor(num) ? "Smith no" : "Not a smith no";
	}
	public static void main(String[] args)
	{
		int num=666;
		System.out.println(checkSmith(num));
		
	}
}
	


