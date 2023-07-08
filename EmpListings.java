import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class EmpListings
{
    public static void main(String args[]) throws Exception
    {
        List<String> lst = new ArrayList<String>(); 
        List<String> single_name_employees = new ArrayList<String>();
        Scanner sc = new Scanner(new File("C:\\Users\\Sree Harsha\\Documents\\JavaAssignment\\EmployeesList.csv"));  
        sc.useDelimiter("\n");   //sets the delimiter pattern  
        while (sc.hasNext())
        {  
            lst.add(sc.nextLine())  ;
        }
        lst.remove(0);
        sc.close();
        //System.out.println(lst);
        System.out.println("Entries in manager.csv file:\n");
        for (String s : lst)
        {
            if(s.contains("Manager"))
            {
                System.out.println(s);
            }
            String[] obj = s.split(",");
            if(!obj[0].contains(" "))
            {
                single_name_employees.add(s);
            }
        }
        System.out.println("\nEntries in single_name_employees.csv file:\n");
        for(String a : single_name_employees )
        {
            System.out.println(a);
        }
    }
}