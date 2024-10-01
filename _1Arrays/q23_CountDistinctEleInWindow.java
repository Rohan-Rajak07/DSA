import java.util.ArrayList;
import java.util.*;

public class q23_CountDistinctEleInWindow 
{
    // Count Distinct Element in Every Window

    static void Approach2(int arr[], int n, int k) //Optimizied solution take o(n)
    {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int a=0; a<k; a++)
        {
            hs.put(arr[a],hs.getOrDefault(arr[a],0)+1);
        }
        System.out.println(hs);
        list.add(hs.size());
        int i=1,j=(k+i)-1;
        while(i<=n-k)
        {
            System.out.println(hs);
            int val=hs.get(arr[i-1]);
            System.out.println(val);
            if(val==1)
            {
                hs.remove(arr[i-1]);
            }
            else
            {
                hs.put(arr[i-1],val-1);
            }
            hs.put(arr[j],hs.getOrDefault(arr[j],0)+1);
            System.out.println(hs);
            list.add(hs.size());
            i++;
            j=(k+i)-1;
        }
        System.out.println(list);
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,1,3,4,2,3};
        int n=arr.length;
        int k=4;

        Approach2(arr, n, k);

        // ArrayList<Integer>list=new ArrayList<>();
        // HashSet<Integer>hs=new HashSet<>();
        // for(int i=0; i<=n-k; i++)
        // {
        //     for(int j=i; j<k+i; j++)
        //     {
        //         hs.add(arr[j]);
        //     }
        //     int x=hs.size();
        //     System.out.println(hs);
        //     hs.removeAll(hs);
        //     System.out.println(hs);
        //     list.add(x);
        // }
        // System.out.println(list);

    }
}
