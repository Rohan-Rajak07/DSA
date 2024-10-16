import java.util.*;

public class q50_RomanToInteger 
{

    static void roman(String str)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int ans=0;
        int n=str.length();
        int prev=0;
        for(int i=n-1; i>=0; i--)
        {
            int curr=hm.get(str.charAt(i));
            if(curr>=prev)ans+=curr;
            else ans-=curr;
            prev=curr;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        String str="XIX";
        roman(str);

    }
}
