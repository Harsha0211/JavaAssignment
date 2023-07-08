import java.util.*;

public class PerfectNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive Number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<num;i++)
        {
            if(num%i == 0)
            {
                sum = sum+i;
            }
        }
        if(num == sum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        sc.close();
    }
}
