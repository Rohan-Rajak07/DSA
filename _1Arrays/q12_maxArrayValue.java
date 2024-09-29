import java.util.Arrays;

public class q12_maxArrayValue 
{
    public static void main(String[] args) 
    {
        int  arr[] = {5,3,2,4,1};
        int n=arr.length;
        int mod=1000000007;
        Arrays.sort(arr);
        int maxVal=0;
        for(int i=0; i<n; i++)
        {
            maxVal+=arr[i]*i;
        }
        int ans=maxVal%mod;
        System.out.println(ans);
    }
}
