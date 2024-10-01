public class q25_splitArray 
{
    // Split an array into two equal sum subarray
    public static void main(String[] args) 
    {
        int arr[]={4,3,0,2,5};
        int n=arr.length;

        int l=1;
        int r=n-2;
        int Lsum=arr[0];
        int Rsum=arr[n-1];
        while(l<=r)
        {
            if(Lsum<Rsum)
            {
                Lsum+=arr[l];
                l++;
            }
            else
            {
                Rsum+=arr[r];
                r--;
            }
        }
        if(Lsum==Rsum)
        {
            System.out.println("true");
            return;
        }
        System.out.println(false);
    }
}
