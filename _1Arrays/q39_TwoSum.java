import java.util.*;

public class q39_TwoSum 
{
    public static void main(String[] args) 
    {
        // 4 8 4 2 0 -10 7 3 -7

        int arr []= {4,8,4,2,0,-10,7,3,-7};
        int n=arr.length;

        ArrayList<ArrayList<Integer>>ans =new ArrayList<>();
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        
        int l=0;
        int r=n-1;
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==0)
            {
                ArrayList<Integer>list=new ArrayList<>();
                list.add(arr[l]);
                list.add(arr[r]);
                ans.add(list);
                l++;
                r--;
                while(l<r && arr[l]==arr[l-1])l++;
                while(l<r && arr[r]==arr[r+1])r--;
            }
            else if(sum<0)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        System.out.println(ans);
    }
}
