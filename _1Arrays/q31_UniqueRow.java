package _1Arrays;
import java.util.*;

public class q31_UniqueRow 
{
    public static void main(String[] args) 
    {
        int n=3,m=4;
        int arr[][]={{1,1,0,1},
                     {1,0,0,1},
                     {1,1,0,1}};

        System.out.println(Arrays.deepToString(arr));

        ArrayList<ArrayList<Integer>>l1=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            ArrayList<Integer>l2=new ArrayList<>();
            for(int j=0; j<m; j++)
            {
                l2.add(arr[i][j]);

            }
            if(!l1.contains(l2))l1.add(l2);
        }
        System.out.println(l1);
    }
}
