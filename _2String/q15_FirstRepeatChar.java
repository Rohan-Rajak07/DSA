package Strings;

import java.util.*;

public class q15_FirstRepeatChar 
{
    public static void main(String[] args) 
    {
        String s="abc";

        HashSet<Character>hs=new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(hs.contains(c))
            {
                System.out.println(c);
                return;
            }
            hs.add(c);
        }
        System.out.println("-1");
    }
}
