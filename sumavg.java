//sum & avg
//ASHWIN C.j
//ROLL NO:18

import java.util.*;

class sum
{
    public static void main(String args[])
        {

            Scanner S1= new Scanner(System.in);
            System.out.println("Enter 2 Num : ");
            int a=S1.nextInt();
            int b=S1.nextInt(); 
            int sum=a+b;
            int avg = sum/2;
            System.out.println ("Sum : " +sum);
            System.out.println("Average : "+avg);
            S1.close();
        }

}
