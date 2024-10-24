package Strings;

import java.util.*;

public class q8_SecMostRepeating 
{
    public static void main(String[] args) 
    {
        String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        HashMap<String,Integer> hm=new HashMap<>();

        for(String x:arr)
        {
                hm.put(x,hm.getOrDefault(x,0)+1);
        }
        System.out.println(hm);
        int max=0;
        int min=0;
        // for(Map.Entry<String,Integer>entry:hm.entrySet())
        // {
        //     if(entry.getValue()>0)
        //     {

        //     }
        // }
        

    }
}
