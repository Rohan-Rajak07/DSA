package _2Strings;

import java.util.Arrays;

public class q13_ReverseWord {

    //Reverse word and sentence also
    static void ReverseSentenceAndWord(String s)
    {
        int n=s.length();
        
        String ans="";
        String x="";
        for(int i=n-1; i>=0; i--)
        {
            if(s.charAt(i)!=' ')
            {
                x+=String.valueOf(s.charAt(i));
            }
            else
            {
                ans+=x+" ";
                x="";
            }
        }
        ans+=x+" ";
        x="";
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        String s="Hey My Name Is Rohan";
        int n=s.length();
        int c=0;
        String arr[]=new String[5];
        String x="";
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)!=' ')
            {
                x+=String.valueOf(s.charAt(i));
            }
            else
            {
                arr[c]=x;
                c++;
                x="";
            }
        }
        arr[c]=x;
        x="";
        System.out.println(Arrays.toString(arr));
        int r=0;
        int l=arr.length-1;
        while(r<l)
        {
            String temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            r++;
            l--;
        }
        System.out.println(Arrays.toString(arr));
        String ans=String.join(" ", arr);
        System.out.println(ans);

       
    }
    
}
