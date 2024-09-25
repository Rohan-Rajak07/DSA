import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class q9_maxRepatNo
{
    public static void main(String[] args) 
    {
        int arr[] = {2, 2, 1,1,2,1, 2};
        int n=arr.length;
        int k=3;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int val=hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }
            else
            {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
        for(Map.Entry<Integer,Integer>entry:hm.entrySet())
        {
            int v=entry.getValue();
            if(v>=k)
            {
                System.out.println(entry.getKey());
                return;
            }
            
        }
        
    }
}