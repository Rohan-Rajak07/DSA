package _0Numbers;

public class q11_PrintStar 
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
