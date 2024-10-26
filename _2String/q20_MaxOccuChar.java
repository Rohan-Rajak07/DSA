package _2Strings;

import java.util.*;

public class q20_MaxOccuChar
{
    // Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character
    public static void main(String[] args) 
    {
        String str = "testsample";
        HashMap<Character,Integer>hs=new HashMap<>();
        for(int i=0; i<str.length(); i++)
        {
            char c=str.charAt(i);
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        int temp=0;
        char ans=' ';
        for(Map.Entry<Character,Integer>e:hs.entrySet())
        {
            char a=e.getKey();
            int v=e.getValue();
            if(v>temp || (v==temp && a<ans))
            {
                temp=v;
                ans=a;
            }
        }
        System.out.println(ans);
        
    }

}
