
// https://www.geeksforgeeks.org/problems/total-count2415/1?page=1&sprint=c155d68ce0801e1b79ac3b3a739ae923&sortBy=submissions


public class q35_TotalCount 
{

     public static void main(String[] args) 
     {
        int arr[] = {5, 8, 10, 13};
        int k = 3;

        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int n=arr[i];
            while(n>0)
            {
                n=n-k;
                count++;
            }
        }
        System.out.println(count);
     }
}