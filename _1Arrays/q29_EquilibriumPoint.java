class q29_EquilibriumPoint
{
    public static int Rightsum(long arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        long arr[] ={1, 4, 5, 2, 10};
        int n=arr.length;
        int left=0;
        int right=Rightsum(arr);
        System.out.println(right);
        // int right=n-1;
        for(int i=0; i<n-1; i++)
        {
            right-=arr[i];
            if(left==right)
            {
                System.out.println(true);
                System.out.println(arr[i]);
                return ;
            }
            left+=(int)arr[i];
        }
        System.out.println(false);

    }
}
