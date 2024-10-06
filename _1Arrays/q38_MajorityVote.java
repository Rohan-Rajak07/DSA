import java.util.*;

/**
 * q38_MajorityVote
 * https://www.geeksforgeeks.org/problems/majority-vote/1
 */
public class q38_MajorityVote 
{

    public static void Method1(ArrayList<Integer>l)
    {
        ArrayList<Integer>ans=new ArrayList<>();

        int n=l.size();
        int x=n/3;
        Collections.sort(l);

        int c=1;
        for(int i=0; i<n-1; i++)
        {
            if(l.get(i)==l.get(i+1))
            {
                c++;
                if(c>x && !ans.contains(l.get(i)))
                {
                    ans.add(l.get(i));
                }
            }
            else
            {
                c=1;
            }

        }
        if(ans.isEmpty())ans.add(-1);
        System.out.println(ans);
    }
    public static void Method2(ArrayList<Integer>l)
    {
        int n=l.size();
        if(n<3)return ;
        int x=n/3;
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            int a=l.get(i);
            hm.put(a, hm.getOrDefault(a,0)+1);
        }

        l.removeAll(l);
        for(Map.Entry<Integer,Integer>entry:hm.entrySet())
        {
            int val=entry.getValue();
            if(val>x)l.add(entry.getKey());
        }
        if(l.isEmpty())l.add(-1);
        System.out.println(l);
        

        
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer>l=new ArrayList<>(Arrays.asList(1,2,2,3));
        Method2(l);

        
    }
}