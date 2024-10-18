package Strings;

import java.util.HashSet;

public class q5_removeDuplicate 
{
   public static void main(String[] args) 
   {
        String str = "geEksforGEeks";
        String ans="";
        HashSet<Character>hs=new HashSet<>();
        for(int i=0; i<str.length(); i++)
        {
            char c=str.charAt(i);
            if(!hs.contains(c))
            {
                ans+=String.valueOf(c);
            }
            hs.add(c);
        }
        System.out.println(ans);
   }
}
