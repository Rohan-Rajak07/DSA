import java.util.Arrays;

public class q22_SumOfMiddle_2SortedArr 
{
    // solve int time-(log n)
    public static void main(String[] args) 
    {
        int  arr1[] = {1, 2, 4, 6, 10};
        int arr2[] = {4, 5, 6, 9, 12};

        int ans[]=new int[arr1.length*2];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                ans[k++]=arr1[i++];
            }
            else ans[k++]=arr2[j++];
        }
        while(i<arr1.length)ans[k++]=arr1[i++]; 
        while(j<arr2.length)ans[k++]=arr1[j++];

        System.out.println(Arrays.toString(ans));

        int len=ans.length;
        if(len%2==0)
        {
            int mid=len/2;
            // System.out.println(ans[mid]+"  "+ans[mid+1]);
            int sum=ans[mid-1]+ans[mid];
            System.out.println(sum);
            return;
        }
        else
        {
            int mid=len/2;
            System.out.println(ans[mid+1]);
            return;
        }
    }
}
