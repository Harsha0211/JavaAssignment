import java.util.*;

class Storing
{
    public List<Integer> store(String s,List<Integer> lst)
    {
        String str = s.replaceAll("\\[|\\]|\\(|\\)","");
        String[] str1 = str.split(",");
        for(String S : str1)
        {
            int num = Integer.parseInt(S);
            lst.add(num);
        }
        return lst;
    }
}
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
        
        Storing obj = new Storing();

        System.out.println("Enter the list a");
        String s1 = sc.nextLine();
        lst1 = obj.store(s1,lst1);

        System.out.println("Enter the list b of same no.of elements");
        String s2 = sc.nextLine();
        lst2 = obj.store(s2,lst2);
        sc.close();

        Swapping obj1 = new Swapping();
        obj1.MinMax(lst1,lst2);
    }
}
