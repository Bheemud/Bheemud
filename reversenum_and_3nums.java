package examples;
import java.util.Scanner;

public class reversenum_and_3nums {
	
	
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev =rev*10+rem;
			num/=10;
		}
		return rev;
	}
	
	public static int length(int num)
	{
		int c=0;
		for(;num>0;num/=10) c++;
		return c;
	}
	
	public static int summaration(int num)
	{
		int sum=0;
		for(;num>0;num/=10) 
			sum=sum+num%10;
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the input");
		int num=sc.nextInt();
		System.out.println("Key :");
		int key=sc.nextInt();
		if(num<0)
		{
			System.out.println("No negatives");
		}
		else
		{
			int reverseNum=reverse(num);
			System.out.println("After reverseing given num = "+reverseNum);
			int lengthNum=length(num);
			System.out.println("Length of num = "+lengthNum);
			while(reverseNum>0)
			{
				if(length(reverseNum)!=key)
				{
					reverseNum/=10;
					continue;
				}
				else
				{
					int reverseSum=summaration(reverseNum);
					System.out.println("Sum of given "+key+" nums = "+reverseSum);
					break;
				}
			}
		}
		
	}

}
