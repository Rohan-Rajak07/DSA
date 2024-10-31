package _0Numbers;
/**
 * q10_IsPrime
 * 
 * https://www.geeksforgeeks.org/problems/prime-number2314/1?page=4&sortBy=submissions
 */
public class q10_IsPrime 
{
    public static boolean isPrime(int n)
    {
        if(n<2)return false;
        int sq=(int)Math.sqrt(n);
        for(int i=2; i<=sq; i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int n=36;
        System.out.println(isPrime(n));
    }
}