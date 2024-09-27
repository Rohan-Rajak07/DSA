package _2String;

import java.util.*;


class q1_NonChar
{
    String s="zxvczbtxyzvy";
    static void bruteForce(String s)
    {
        int i=0;
        int j=i+1;
        int c=0;
        while (i<s.length() && j<s.length()) 
        {
            if(i!=j && s.charAt(i)==s.charAt(j))
            {
                i++;
                j=0;
            }
            else
            {
                j++;
            }
        }
        if(j==s.length() && i<s.length()-1)
        {
            System.out.println(s.charAt(i));
            return;
        }
        System.out.println(-1);
    }
    static void optimize(String s)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(hm.get(c)==1)
            {
                System.out.println(c);
                return;
            }
        }
    }
    public static void main(String[] args) 
    {
        String s="sslnkfdmtlxcttdczul";
        bruteForce(s);
    }
}