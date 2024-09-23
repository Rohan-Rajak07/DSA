package _0Numbers;
import java.util.*;

public class q6_RomanToInteger 
{
    public static void main(String[] args) 
    {
        String s="XI";
        int n=s.length();
        int ans=0;

        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        ans=hm.get(s.charAt(0));
        int a=ans;
        for(int i=1; i<n; i++)
        {
            char c=s.charAt(i);
            int val=hm.get(c);
            if(a<val)
            {
                ans=val+ans;
                a=val;
            }
            else
            {
                ans-=val;
                a=val;
            }


        }
        System.out.println(ans);

    }
}
