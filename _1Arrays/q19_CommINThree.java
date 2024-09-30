import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class q19_CommINThree 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer>arr1=new ArrayList<>(Arrays.asList(1, 5, 10, 20, 40, 80));
        ArrayList<Integer>arr2=new ArrayList<>(Arrays.asList(6, 7, 20, 80, 100));
        ArrayList<Integer>arr3=new ArrayList<>(Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120));

        HashSet<Integer>hs=new HashSet<>(arr2);
        System.out.println(hs);

        ArrayList<Integer>temp=new ArrayList<>(hs);
        System.out.println(temp);
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i:arr2)
        {
            if(arr1.contains(i))
            {
                temp.add(i);
            }
        }
        for(int i:arr3)
        {
            if(temp.contains(i))
            {
                ans.add(i);
            }
        }
        System.out.println(ans);
        
    }
}
