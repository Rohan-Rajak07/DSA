package _2Strings;

public class q24_Palindrom 
{
    static boolean isPalindrom(String s,int l, int r)
    {
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r))return false;
        return isPalindrom(s, l+1, r-1);

    }
    public static void main(String[] args) 
    {
        String s="abba";
        int n=s.length();
        int l=0;
        int r=n-1;
        System.out.println(isPalindrom(s,l,r));
    }
}
