import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class where_is_max
{
    public int max_is_in(int max_1, int max_2)
    {
        if(max_1 > max_2){
            return 0;
        }
        else if(max_2 > max_1){
            return 1;
        }
        else{
            return 2;
        }
    }
}
class Swapping
{
    public int flag;
    public int temp;
    List<Integer> temp1 = new ArrayList<Integer>();
    public void MinMax(List<Integer> A, List<Integer> B)
    {
        int Max_A = Collections.max(A);
        int Max_B = Collections.max(B);
        int max = Math.max(Max_A,Max_B);

        where_is_max obj1 = new where_is_max();
        int flag = obj1.max_is_in(Max_A,Max_B);

        if(flag == 1){
            temp1 = B;
            B = A;
            A = temp1;
            flag = 0;
        }
        if(flag == 0)
        {
            for(int i=0;i<B.size();i++)
            {
                int max_B = Collections.max(B);
                int j = B.indexOf(max_B);
                int x = A.get(j);
                if(x < max_B)
                {
                    A.set(j,max_B);
                    B.set(j,x);
                }
            }
        }
        int max_B = Collections.max(B);
        System.out.println(max*max_B);
    }
}

public class SwappingMinMax
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();

        System.out.println("Enter the list size");
        int n = sc.nextInt();

        System.out.println("Enter the elements of list a");
        for(int i=0;i<n;i++)
        {
          int b = sc.nextInt();
          lst1.add(b);
        }
        System.out.println(lst1);

        System.out.println("Enter the elements of list b");
        for(int i=0;i<n;i++)
        {
          int b = sc.nextInt();
          lst2.add(b);
        }
        System.out.println(lst2);

        sc.close();

        Swapping obj = new Swapping();
        obj.MinMax(lst1,lst2);
    }
}
