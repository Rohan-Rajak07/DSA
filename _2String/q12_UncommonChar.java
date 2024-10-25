package _2Strings;

import java.util.*;

public class q12_UncommonChar 
{
    public static void main(String[] args) 
    {
        String A = "geeksforgeeks";
        String B = "geeksquiz";
        String ans="";

        HashSet<Character> hsA=new HashSet<>();
        HashSet<Character> hsB=new HashSet<>();
        ArrayList<Character>list=new ArrayList<>();
        // for(int i=0; i<A.length(); i++)
        // {
        //     char c=A.charAt(i);
        //     hsA.add(c);
        // }
        // for(int j=0; j<B.length(); j++)
        // {
        //     char c=B.charAt(j);
        //     hsB.add(c);
        // }


        for(int x=0; x<A.length(); x++)
        {
            char c=A.charAt(x);
            if(!B.contains(String.valueOf(c)))
            {
                list.add(c);
            }
        }
        for(int y=0; y<B.length(); y++)
        {
            char c=B.charAt(y);
            if(!A.contains(String.valueOf(c)))
            {
                list.add(c);
            }
        }
        Collections.sort(list);
        System.out.println(list);

        for(int i=0;i<list.size(); i++)
        {
            ans+=list.get(i);
        }
        System.out.println(ans);

        
                

    }
    

}
