import java.util.Arrays;

public class q21_MaxSumAfterKEle 
{
    public static void main(String[] args) 
    {
        int a[]={-1,-2,-3,-4,-5};
        int n=a.length;
        int k=10;

        int sum=0;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=0; i<n; i++)
        {
            if(a[i]<0 && k>0)
            {
                a[i]=-a[i];
                k--;
                
            }
            sum+=a[i];
        }
        System.out.println(Arrays.toString(a));
        
        if(k>0)
        {
            if(k%2==0)
            {
                System.out.println(sum);
                return;
            }
            else
            {
                Arrays.sort(a);
                int sub=a[0]+a[0];
                System.out.println(sum-sub);
                return;
            }
        }
    }
}
