import java.util.Arrays;

public class q18_sortMatrix 
{
    public static void main(String[] args) 
    {
        
        int arr[][]={{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        System.out.println(n);
        int ans[][]=new int[n][n];
        int temp[]=new int[n*n];

        int x=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                temp[x]=arr[i][j];
                x++;

            }
        }
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        x=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                ans[i][j]=temp[x];
                x++;

            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println(Arrays.toString(ans));



    }
}
