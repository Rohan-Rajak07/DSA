import java.util.Arrays;

public class q2_find2Index {
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,5};
        int key=5;
        int ans[]={-1,-1};
        int c=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key && c==0)
            {
                c++;
                ans[0]=i;
                ans[1]=i;
            }
            else if(arr[i]==key && c==1)
            {
                ans[1]=i;
            }
            
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
