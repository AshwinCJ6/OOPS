
import java.util.*;
class matrixsub
{
public static void main(String args[])
{
int a[][]=new int[50][50];
int b[][]=new int[50][50];
int difference[][]=new int[50][50];
Scanner s=new Scanner(System.in);
 System.out.println("Enter the num of rows : ");
int row=s.nextInt();
System.out.println("Enter the num of col : ");
int col=s.nextInt();
System.out.println("The 1st matrix : ");
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
		{
			a[i][j]=s.nextInt();
		}
}
System.out.println("The 2nd matrix : ");
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
		{
			b[i][j]=s.nextInt();
		}
}
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
		{
			difference[i][j]=a[i][j]-b[i][j];
		}
}
System.out.println("Diff of 2 matrices : ");
for (int i = 0; i < row; i++) {
	for (int j = 0; j < col; j++) {
		System.out.print(difference[i][j] + " ");
	}
	System.out.println(); 
}

s.close();
}
}