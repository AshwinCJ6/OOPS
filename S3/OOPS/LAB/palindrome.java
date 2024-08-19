import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter a string :");
String a=s1.nextLine();
int len=a.length();
String rev="";
for(int i=len-1;i>=0;i--)
{
rev=rev+a.charAt(i);
}
if(a.equals(rev))
{
System.out.println(a+" is a palindrome");
}
else
{
System.out.println(a+" is not a palindromne");
}
s1.close();
}
}
