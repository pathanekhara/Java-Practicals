package Practice;

public class xylemPhoeme
{
    public static void main(String[] args) 
    {
        int[] arr={12348, 1234, 1210, 34326, 111, 3234235, 1234};
        for(int i=0;i<arr.length;i++)
    {
	    int num=arr[i];    
        int last=num%10;
        num=num/10;
        int sum=0;
        while(num>9)
        {
            sum=sum+num%10;
        	num/=10;
        }
        int first=num;   
        System.out.println(last+num==sum ? "Xylem" : "Phoeme");
    }
    }
}
