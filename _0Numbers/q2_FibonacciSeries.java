package _0Numbers;
class q2_FibonacciSeries
{
    static void  fibo(int x)
    {
        int i=0,j=1,sum=0;
        System.out.print(i+" "+j+" ");
        for(int k=2; k<=x; k++)
        {
            sum=i+j;
            System.out.print(sum+" ");
            i=j;
            j=sum;
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void main(String[] args) 
    {
        //  0 1 1 2 3 5 8 13 21 34 
        // int n=7;
        // int sum=0;
        // int k=0;
        // int j=1;
        // System.out.print(k+" ");
        // for(int i=1; i<=n; i++)
        // {
        //     if(i%2==0)
        //     {
        //         sum=k+j;
        //     // System.out.print(sum +" ");
        //     k=j;
        //     j=sum;
        //     }
        //     sum=k+j;
        //     System.out.print(sum +" ");
        //     k=j;
        //     j=sum;
        // }
        fibo(6);
    }
}