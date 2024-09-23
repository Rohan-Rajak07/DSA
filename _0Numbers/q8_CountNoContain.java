package _0Numbers;

public class q8_CountNoContain 
{
    // Count numbers containing 4 from 1 to N
    public static void main(String[] args) 
    {
        int n=9;
        int c=0;
        for(int i=1; i<=n; i++)
        {
            int x=i;
            while(x!=0)
            {
                if(x%10==4)
                {
                    c++;
                    break;
                }
                x=x/10;
            }
        }
        System.out.println(c);
    }
}
