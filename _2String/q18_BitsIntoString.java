package _2Strings;

public class q18_BitsIntoString 
{
    public static void main(String[] args) 
    {
        int n=5;
        int count=0;
        int ans=0;
        String s=Integer.toBinaryString(n);
        System.out.println(s);
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                count++;
            }
            else
            {
                if(ans<count)ans=count;
                count=0;
            }
        }
        if(ans<count)ans=count;
        System.out.println(ans);
    }
}
