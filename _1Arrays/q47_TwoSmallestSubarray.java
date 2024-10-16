import java.util.Arrays;

public class q47_TwoSmallestSubarray 
{
    // https://www.geeksforgeeks.org/problems/maximum-sum-of-smallest-and-second-smallest-in-an-array/1

    public static void twoSmall(int arr[])
    {
        int ans=-1;
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            int fsmall=arr[i];
            for(int j=i+1; j<n; j++)
            {
                int Ssmall=arr[j];
                if(arr[j]<fsmall)
                {
                    Ssmall=fsmall;
                    fsmall=arr[j];
                }
                if(arr[j]<Ssmall && arr[j]!=fsmall)Ssmall=arr[j];
                int sum=fsmall+Ssmall;
                if(sum>ans)ans=sum;
            }
        }
        System.out.println(ans);
    }
    public static void twoSmall2(int arr[])
    {
        int ans=-1;
        int n=arr.length;
        if(n==1) return ;
        Arrays.sort(arr);
        int sum=arr[n-1]+arr[n-2];
        System.out.println(sum);
    }

        
    public static void main(String[] args) 
    {
        int arr[] ={9,2,3,2,5,2,8};
        twoSmall2(arr);
    }
}
