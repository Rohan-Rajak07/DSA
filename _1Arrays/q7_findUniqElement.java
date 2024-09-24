import java.util.HashMap;
import java.util.Map;

public class q7_findUniqElement 
{
    public static void main(String[] args) 
    {
        int arr[] = {10,11, 11, 5, 10, 5, 5, 10, 10, 5, 10, 10, 11, 10, 10, 10, 5 ,10, 5, 11, 10, 5, 11, 11, 10};
        int n=arr.length;
        int k=6;

        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int val=hm.get(arr[i]);
                hm.put(arr[i], val+1);
            }
            else
            {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            int v=entry.getValue();
            if(v%k!=0)
            {
                int ans=entry.getKey();
                System.out.println(ans);
                return;
            }
        }
    }
}
