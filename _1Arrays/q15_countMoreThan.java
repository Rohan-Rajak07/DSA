import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class q15_countMoreThan 
{
    public static void main(String[] args) 
    {
        int arr[]={3,1,2,2,1,2,3,3};
        int n=arr.length;
        int k=4;
        int ans=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        int x=n/k;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet())
        {
            int val=entry.getValue();
            if(val>x)
            {
                ans=entry.getKey();
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);

    }
}
