package _2Strings;

public class q19_Instagram 
{
    // you have to reverse the string if you found "i" int the string reverse previous of 
    // "i" string

    static String Reverse(String s, int l, int r)
    {
        String x=s.substring(l,r);
        StringBuilder a=new StringBuilder(x).reverse();
        String b=String.valueOf(a);
        return b;

    }
    public static void main(String[] args) 
    {
        String s="stringiarohan";
        String ans="";
        int l=0;
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(c=='i')
            {
                ans+=Reverse(s, l, i);
                l=i+1;
            }
        }
        ans+=s.substring(l, s.length());
        System.out.println(ans);
    }
}
