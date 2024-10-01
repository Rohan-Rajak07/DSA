import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q24_MinimizeTheSum 
{
    // You are given two arrays arr1 and arr2. The task is to find the minimum value of arr1[0] * arr2[0] + arr1[1] * arr2[1] + .... + arr1[N-1] * arr2[N-1], where the shuffling of elements of arrays arr1 and arr2 is allowed.
    public static void main(String[] args) 
    {
        ArrayList<Integer>arr1=new ArrayList<>(Arrays.asList(6, 1, 9, 5, 4));
        ArrayList<Integer>arr2=new ArrayList<>(Arrays.asList(3, 4, 8, 2, 4));

        Collections.sort(arr1);

        Collections.sort(arr2);
        Collections.reverse(arr2);

        int i=0;
        int sum=0;
        while(i<arr1.size())
        {
            int p=arr1.get(i)*arr2.get(i);
            sum+=p;
            i++;
        }
        System.out.println(sum);

    }
}
