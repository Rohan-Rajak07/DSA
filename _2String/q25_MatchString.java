package _2Strings;

import java.util.*;

public class q25_MatchString 
{
    static boolean mehtod1(String a,String b)
    {
        if(a.length()!=b.length())return false;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0; i<b.length(); i++)
        {
            char c=b.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        System.out.println(hm);

        for(int i=0; i<a.length(); i++)
        {
            char c=a.charAt(i);
            if(hm.containsKey(c))
            {
                int val=hm.get(c);
                hm.put(c,val-1);
                if(hm.get(c)==0)
                {
                    hm.remove(c);
                }
            }
            else
            {
                // System.out.println(false);
                return false;
            }

        }
        return true;

    }
    static boolean mehtod2(String a, String b)
    {
        if(a.length()!=b.length())return false;
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        String a="geeksforgeeks";
        String b = "forgeeksgeeks";
        System.out.println(mehtod2(a, b));
  
    }
}
