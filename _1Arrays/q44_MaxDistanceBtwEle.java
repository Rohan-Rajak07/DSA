import java.util.HashMap;

/**
 * q44_MaxDistanceBtwEle
 * https://www.geeksforgeeks.org/problems/max-distance-between-same-elements/1
 */
public class q44_MaxDistanceBtwEle 
{
    public static void main(String[] args) 
    {
        int arr[]= {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int n=arr.length;
        int ans=0;

        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            hm.put(arr[i],i);
        }
        System.out.println(hm);

        for(int i=0; i<n/2; i++)
        {
            int val=hm.get(arr[i]);
            int sub=Math.abs(val-i);
            // System.out.println(sub);
            if(sub>ans)ans=sub;
        }
        System.out.println("Ans: "+ans);

    }
}