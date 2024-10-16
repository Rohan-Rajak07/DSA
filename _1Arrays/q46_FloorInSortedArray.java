public class q46_FloorInSortedArray 
{
    public static void findFloor(long arr[],int n,long x)
    {
        int ans=-1;
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
            {
                System.out.println(mid);
                return;
            }
            if(arr[mid]<x)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        System.out.println(ans);
        // System.out.println(l);
    }
    public static void main(String[] args) 
    {
        long arr[] = {1,2,8,10,11,12,19};
        int n = arr.length;
        System.out.println(n);
        long x =10;

        findFloor(arr, n, x);
    }
}
