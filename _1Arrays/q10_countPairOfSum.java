import java.util.HashMap;

public class q10_countPairOfSum 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,1,1};
        int k=2;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int x=k-arr[i];
            if(hm.containsKey(x))
            {
                int val=hm.get(x);
                count+=val;
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(count);
    }
}
