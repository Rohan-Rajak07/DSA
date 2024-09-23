package _0Numbers;

import java.util.ArrayList;
import java.util.Arrays;

class q5_FirstNFibonacci
{
    public static void main(String[] args) 
    {
        int n=75;
        long arr[]=new long[n];

        long a=0;
        long b=1;
        arr[0]=b;
        for(int i=1; i<n; i++)
        {
            long sum=a+b;
            arr[i]=sum;
            a=b;
            b=sum;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

    }
}