import java.util.Arrays;

public class q20_kthElement 
{

    public static void main(String[] args) 
    {
        int q = 5;
        int arr1[] = {2, 3, 6, 7, 9}; 
        int arr2[] ={1, 4, 8, 10};
        int n=arr1.length;
        int m=arr2.length;
        int ans[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                ans[k++]=arr1[i++];
                // k++;
                // i++;
            }
            else
            {
                ans[k++]=arr2[j++];
                
            }
        }
        while(i<n) ans[k++]=arr1[i++];
        while(j<m) ans[k++]=arr2[j++];
        System.out.println(Arrays.toString(ans));
        long a=(int)ans[5-1];
        System.out.println(a);
    }
    
}
