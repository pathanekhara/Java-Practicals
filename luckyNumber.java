package Practice;

public class luckyNumber
{
	public static void main(String args[])
	{
	int num=01112005;
	int sum=0;
	while(num!=0)
	{
		sum+=num%10;
		num/=10;
	}
return sum;
}
}

