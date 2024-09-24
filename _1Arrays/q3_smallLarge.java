import java.util.Arrays;

public class q3_smallLarge {
    public static void main(String[] args) {
       long arr[]={2,8,7,1,5};
       long n=arr.length;
       long ans[]=new long[(int)n-2];
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       for(int i=0; i<n-2; i++)
       {
            ans[i]=arr[i];
       }
       System.out.println(Arrays.toString(ans));

    }
    
}
