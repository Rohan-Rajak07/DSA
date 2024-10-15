public class q42_RowWIthMax1 
{
    // https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?page=4&sortBy=submissions
    public static void main(String[] args) 
    {
        int arr[][]={{0},{0}};
        int ans=-1;
        int max=0;
        for(int i=0; i<arr.length; i++)
        {
            int c=0;
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j]==1)c++;
            }
            if(c>max)
            {
                ans=i;
                max=c;
            }
            
        }
        // return ans;
        System.out.println(ans);
    }
}
