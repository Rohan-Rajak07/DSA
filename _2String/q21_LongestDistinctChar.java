package _2Strings;

import java.util.HashMap;

public class q21_LongestDistinctChar 
{
    //---Longest Distinct Character-------
    public static void main(String[] args) 
    {
        String s="aewerg";

        HashMap<Character,Integer>hm=new HashMap<>();
        int count=0;
        int ans=0;
        int i=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            if(hm.containsKey(c))
            {
                if(ans<count)
                {
                    ans=count;
                }
                i=hm.get(c)+1;
                System.out.println(i);
                hm.clear();
                count=0;
            }
            else
            {
                hm.put(c, i);
                count++;
                i++;
            }
        }
        if(ans<count)ans=count;
        System.out.println(ans);
    }
}
