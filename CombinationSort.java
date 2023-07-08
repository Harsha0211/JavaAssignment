import java.util.*;

class Listsort
{
    public List<String> sort(List<String> List1)
    {
        for(int j=0;j<List1.size()-1;j++)
        {
            for(int k=j+1;k<List1.size();k++)
            {
                String s1 = List1.get(j);
                String s2 = List1.get(k);
                if(s1.charAt(0) == s2.charAt(0))
                {
                    int num1 = Integer.parseInt(s1.substring(1));
                    int num2 = Integer.parseInt(s2.substring(1));
                    if(num1 < num2)
                    {
                        List1.set(j,s2);
                        List1.set(k,s1);
                        //k++;
                    }
                }
            }
        }
        return List1;
    }
}

public class CombinationSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.replaceAll("\\ ","");
        String[] str1 = str.split(",");
        List<String> L = new ArrayList<>(); 
        
        for (String s : str1)
        {
            L.add(s);
        }
        
        List<String> L1 = new ArrayList<>();
        //List<String> L2 = new ArrayList<>();
        for(char i='a';i<='z';i++)
        {
            for(String s1 : L)
            {
                if(s1.charAt(0) == i)
                {
                    L1.add(s1);
                }
            }
        }
        System.out.println("L1: " +L1);

        Listsort obj = new Listsort();
        List<String> L2 = obj.sort(L1);
        System.out.println("L2: "+L2);
        sc.close();
    }    
}
