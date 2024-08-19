
import java.util.*;
class rootpower
{
    public static void main (String args[])
    {
        int x,y;
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter x : ");
        x=S1.nextInt();
        System.out.println( "Enter y : ");
        y=S1.nextInt();
        double sqrt=Math.sqrt(x);
        double power=Math.pow(x,y);
        System.out.println("Root : "+sqrt); 
        System.out.println("Power : "+power);
        S1.close();
    }
}
