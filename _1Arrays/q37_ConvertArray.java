import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class q37_ConvertArray 
{
    // https://www.geeksforgeeks.org/problems/convert-an-array-to-reduced-form1101/1?page=1&sprint=1512aa422cca86c76b92a0ca9076eeea&sortBy=submissions

    public static void main(String[] args) 
    {
        int arr[]={10, 40, 20};
        int n=arr.length;

        int ans[]=arr.clone();
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);

        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            hs.put(ans[i], i);
        }
        System.out.println(hs);
        for(int i=0; i<n; i++)
        {
            arr[i]=hs.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));


    }
}
