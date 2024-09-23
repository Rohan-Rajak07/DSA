package _0Numbers;

public class q3_SquareRoot 
{
    public static void Approach1(int n)
    {
        //using Math.sqrt method to get answer
        int x=(int)Math.sqrt(n);
        System.out.println(x);
    }
    public static void Approach2(int n)
    {
        if(n==1)System.out.println(1);
        int ans=0;
        int mid=n/2;
        for(int i=1;i<=mid; i++)
        {
            int x=i*i;
            if(x<=n)
            {
                ans=i;
            }
            else
            {
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        Approach2(50);
    }
}
