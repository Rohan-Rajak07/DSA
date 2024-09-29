import java.util.Arrays;

public class q13_productArrayPuzzle
{
    public static void main(String[] args) 
    {
        int arr[] = {7,8,6,4,6,7,3,10,2,3,8,1,10,4,7,1,7,3, 7, 2, 9, 8, 10, 3, 1, 3 ,1 ,1 ,1,1,1,1,1,1};
        int n=arr.length;
        long a[]=new long[n];
        long p=1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i!=j)
                {
                    p*=arr[j];
                }
            }
            a[i]=p;
            p=1;
        }
        System.out.println(Arrays.toString(a));

    }
}
