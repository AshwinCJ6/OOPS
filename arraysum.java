import java.util.*;
class arraysum
{
	public static void main(String args[])
	{
		int sum=0;
		int i;
		int num[]=new int[50];
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the length : ");
		int length=S.nextInt();
		System.out.println("Enter the element : ");
		for(i=0;i<length;i++)
		{
			num[i]=S.nextInt();
		}
		for(i=0;i<length;i++)
			{
				sum=sum+num[i];
			}
		System.out.println("Sum : "+sum);
		S.close();
	}
}