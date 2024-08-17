//frequency of char
//ASHWIN C.J
//ROLL NO: 35
import java.util.*;
class frequency
{
public static void main(String args[])
{  
	int count=0;
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the string : ");
	String sr;
	sr=S.nextLine();
	sr.toLowerCase();
	System.out.println("Enter the char to check : ");
	char c= S.next().charAt(0);
	int len=sr.length();
	for(int i=0;i<len;i++)
	{
	if(sr.charAt(i)== c)
	  {
		   	 
	   count++;
	  }
	}
	System.out.println("The frequency of char : "+count);
	S.close();
}
}
