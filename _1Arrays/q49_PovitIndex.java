public class q49_PovitIndex 
{

    static void povitPoint(int arr[], int n)
    {
        int totalsum=0;
        for(int i=0; i<n; i++)
        {
            totalsum+=arr[i];
        }
        int leftsum=0;
        int rightsum=totalsum;
        for(int i=0; i<n; i++)
        {
            rightsum=rightsum-arr[i];
            if(leftsum==rightsum)
            {
                System.out.println("index :"+i);
                return;
            }
            leftsum+=arr[i];
        }
        System.out.println(-1);
    }
    public static void main(String[] args) 
    {
        int arr[]={1,10,2,3,3};
        int n=arr.length;
        povitPoint(arr, n);
    }
}
