import java.util.Arrays;

public class q32_RotateArray 
{
    static void Reverse(int arr[],int l,int r)
    {
        while(l<r)
        {
            int temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
        // System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int d=2;
        d=d%n;
        Reverse(arr, 0, d-1);
        Reverse(arr, d, n-1);
        Reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}


