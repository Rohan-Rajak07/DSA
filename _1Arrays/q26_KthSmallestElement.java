public class q26_KthSmallestElement 
{
    // Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array. It is given that all array elements are distinct.
    public static void main(String[] args) 
    {
        int arr[] = {7, 10, 4, 20, 15};
        int n=arr.length;
        int k = 4;

        int rem=n-k;
        for(int i=0; i<n; i++)
        {
            int c=0;
            for(int j=0; j<n; j++)
            {
                if(arr[i]<arr[j])
                {
                    c++;
                }
            }
            if(rem==c)
            {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("not found");
    }
}
