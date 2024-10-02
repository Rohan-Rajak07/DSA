// package Arrays;

import java.util.ArrayList;

public class q27_IndexOfSubArray
{
    // Given an unsorted array arr of size n that contains only non negative integers, find a sub-array (continuous elements) that has sum equal to s. You mainly need to return the left and right indexes(1-based indexing) of that subarray.
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int  s = 15;

        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            int sum=arr[i];
            for(int j=i+1; j<n; j++)
            {
                sum+=arr[j];
                if(sum==s)
                {
                    l.add(i+1);
                    l.add(j+1);
                    System.out.println(l);
                    return;
                }
                if(sum>n)break;
            }
        }
        if(l.size()==0) l.add(-1);
        System.out.println(l);

    }
}