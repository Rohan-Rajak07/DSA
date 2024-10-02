import java.util.*;


public class q30_FindAllPair 
{
    // Find all pairs with a given sum
    public static void main(String[] args) 
    {
        int arr1[] = {1, 2, 4, 5, 7};
        int arr2[] = {5, 6, 3, 4, 8};
        int x=9;

        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0; i<arr2.length; i++)
        {
            hs.put(arr2[i], hs.getOrDefault(arr2[i],0)+1);
        }
        System.out.println(hs);

        for(int i=0; i<arr1.length; i++)
        {
            int rem=x-arr1[i];
            if(hs.containsKey(rem))
            {
                int ans[]=new int[2];
                ans[0]=arr1[i];
                ans[1]=rem;
                System.out.println(Arrays.toString(ans));
                hs.put(rem,hs.get(rem)-1);
                if(hs.get(rem)==0)
                {
                    hs.remove(rem);
                }

            }
        }
    }

}
