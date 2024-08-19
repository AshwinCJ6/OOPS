//student details
//ASHWIN C.J
//ROLL NO:18
import java.util.*;
class student
{
    public static void main(String args[])
    {
        Scanner S1 = new Scanner(System.in);
        int roll;
        String name,cls;
        System.out.println("Name : ");
        name = S1.nextLine(); 
        System.out.println("Class : ");
        cls = S1.nextLine();
        System.out.println("Roll No. : ");
        roll = S1.nextInt();

        System.out.println("Name is : "+name);

        System.out.println("Class is : "+cls);

        System.out.println("Roll no. is : "+roll);
        S1.close();
    }
}
