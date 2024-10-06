import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * q40_KSizeSubArray
 * https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
 */
public class q40_KSizeSubArray 
{

    public static void main(String[] args) 
    {
        int k = 3;
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();

        HashMap<Integer,Integer>hs=new HashMap<>();
        int max=0;
        for(int i=0; i<k; i++)
        {
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hs);
        max=Collections.max(hs.keySet());
        ans.add(max);
        int x=0;
        for(int i=k; i<n; i++)
        {
            if(hs.get(arr[x])>1)hs.put(arr[x], 1);
            else
            {
                hs.remove(arr[x]);
            }
            x++;
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
            max=Collections.max(hs.keySet());
            ans.add(max);
        }
        System.out.println(ans);

        
    }
}