package Strings;

import java.util.Arrays;

public class q4_ReversWord 
{
    public static void main(String[] args) 
    {
        String s="My Name is Rohan";
        String ans="";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1; i>=0; i--)
        {
            ans+=arr[i]+" ";
        }
        System.out.println(ans);

    }
}
