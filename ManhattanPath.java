import java.util.*;

public class ManhattanPath
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        
        System.out.println("Enter the co-ordinates of start point");
        String s = sc.nextLine();
        s = s.replaceAll("\\(|\\)|\\[|\\]", "");

        String[] str = s.split(",");
        for (String obj : str)
        {
            int intValue = Integer.parseInt(obj);
            lst.add(intValue);
        }

        int x = lst.get(0);
        int y = lst.get(1);

        int N_count = 0 ,S_count = 0 ,E_count = 0 ,W_count = 0;
        System.out.println("Enter the path");
        String directions = sc.nextLine();
        directions = directions.toUpperCase();

        for(int i=0;i<directions.length();i++)
        {
            if(directions.charAt(i) == 'N'){
                N_count++;
            }
            else if(directions.charAt(i) == 'S'){
                S_count++;
            }
            else if(directions.charAt(i) == 'E'){
                E_count++;
            }
            else if(directions.charAt(i) == 'W'){
                W_count++;
            }
        }

        int y1 = Math.abs(y + N_count - S_count);        
        int x1 = Math.abs(x + E_count - W_count);
        double shortest_d = Math.sqrt((x1-x)*(x1-x)+ (y1-y)*(y1-y));
        System.out.printf("%.1f",shortest_d);
        sc.close();
    }
}