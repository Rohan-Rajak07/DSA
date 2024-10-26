package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class q16_CheckBothString 
{
    // Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings a and b can only contain lower case alphabets.
    public static void main(String[] args) 
    {
        String a="geeksforgeeks";
        String b = "forgeeksgeek";
        if(a.length()!=b.length())
        {
            System.out.println(false);
            return;
        }
        
        HashMap<Character,Integer>hs=new HashMap<>();
        // HashMap<Character,Integer>hs2=new HashSet<>();
        for(int i=0; i<b.length(); i++)
        {
            char c=b.charAt(i);
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for(int i=0; i<b.length(); i++)
        {
            char c=a.charAt(i);
            if(hs.containsKey(c))
            {
                hs.put(c,hs.get(c)-1);
                int val=hs.get(c);
                if(val==0)
                {
                    hs.remove(c);
                }
            }
            else
            {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        return;
    }
}
