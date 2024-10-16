import java.util.ArrayList;
import java.util.Arrays;

public class q48_RemoveDuplicate 
{
    // https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?page=2&difficulty=Easy&sortBy=submissions
    public static void main(String[] args) 
    {
        ArrayList<Integer>l=new ArrayList<>(Arrays.asList(1,2,2,3,4));
        System.out.println(l);
        for(int i=0;i<l.size()-1; i++)
        {
            System.out.println(l.size());
            if(l.get(i)==l.get(i+1))
            {
                l.remove(i);
                i--;
            }
            System.out.println(l);
        }
        // System.out.println(l);

    }
}
