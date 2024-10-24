package Strings;

import java.util.*;

class q6_validIPAddress
{
    public static void main(String[] args) 
    {
        String str="192..168.0.255";
        int n=str.length();
        int dot=0;
        int ind=-1;
        int temp=0;
        for(int i=0; i<n; i++)
        {
            char c=str.charAt(i);
            if(c=='.')
            {
                dot++;
                if(temp>255 || temp<0 || dot>3 || str.charAt(i+1)=='0' || ind==i-1 ) 
                {
                    System.out.println(false);
                    return;
                }
                ind=i;
            }
            else
            {
                temp=(temp*10)+(c-'0');
            }
        }
        if(temp>255 || temp<0 || dot>3) 
        {
            System.out.println(false);
            // return;
        }
        else
        {
            System.out.println(true);
        }

    }
}