package _0Numbers;
import java.util.*;

public class q9_PrintPattern 
{
    // 16 11 6 1 -4 1 6 11 16
    public static void main(String[] args) 
    {
        ArrayList<Integer>l=new ArrayList<>();

        int n=10;

        if(n<=0)
        {
            l.add(null);
            System.out.println(l);
            return;
        }
        l.add(n);

        int a=n-5;
        l.add(a);

        int c=0;

        while(a!=n)
        {
            if(a>0 && c==0)
            {
                a=a-5;
                l.add(a);
            }
            else
            {
                a=a+5;
                l.add(a);
                c=1;
            }
        }
        System.out.println(l);
    }
    
}
