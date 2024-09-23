package _0Numbers;

import java.util.*;

public class q7_SumOfOddEven 
{
    public static void main(String[] args) 
    {
        int n=1;

        ArrayList<Integer>l=new ArrayList<>();
        int odd=0;
        int even=0;
        for(int i=0; i<=n; i++)
        {
            if(i%2==0)even+=i;
            else odd+=i;
        }
        l.add(even);
        l.add(odd);
        System.out.println(l);
    }
}
