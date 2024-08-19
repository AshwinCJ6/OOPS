
import java.util.*
class largest 
{
        public static void main(String args[]) 
        {
        int largest=0;
        int num, n;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num of elements : ");
        n = s.nextInt();
        
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++)
         {
            num = s.nextInt();
            if (num > largest) 
            {
                largest = num;
            }
        }
        
        System.out.println("The largest num is : " + largest);
        s.close();
    }
}
