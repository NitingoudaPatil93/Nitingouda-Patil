import java.util.Scanner;
class Odd
{
	
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter how many odd numbers should be displayed");
	int n=scan.nextInt();
	int count=0;
   if(n==1)
		{
	   System.out.println("1");
		}
		else if(n%2!=0)
		{
			
	for(int i=1;i<100;i++)
		{
		if(count<n)
			{
			if(i%2!=0)
				{
				++count;
				System.out.println(i);
				}
			}
		}
		}
		else
			{
			int m=n-1;
			for(int i=0;i<100;i++)
		{
		if(count<m)
			{
			if(i%2!=0)
				{
				++count;
				System.out.println(i);
				}
			}
		}
		}

	}
}
