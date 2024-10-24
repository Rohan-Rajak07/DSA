package Strings;

public class q10_ReverseString 
{
    public static void main(String[] args) 
    {
        String str="RohanRajak";
        String ans="";
        int n=str.length();
        for(int i=n-1; i>=0; i--)
        {
            char c=str.charAt(i);
            ans+=String.valueOf(c);
            // System.out.print(c);
        }
        System.out.println(ans);

        StringBuilder s=new StringBuilder(str).reverse();
        String x=String.valueOf(s);
        System.out.println(x);
    }
    
}
