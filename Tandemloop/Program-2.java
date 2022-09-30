import java.util.Scanner;
class Odd
{
	
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int count=0;

	for(int i=0;i<100;i++)
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
}