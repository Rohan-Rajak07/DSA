import java.util.Arrays;

public class q14_AlterPosAndNeg 
{
    public static void main(String[] args) 
    {
        int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int len=arr.length;
        int p[]=new int[len];
        int n[]=new int[len];
        int s=0,t=0;
        for(int i=0; i<len; i++)
        {
            if(arr[i]>=0)
            {
                p[s]=arr[i];
                s++;
            }
            else
            {
                n[t]=arr[i];
                t++;
            }
        }
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(n));
        int ans[]=new int[len];
        int x=0;
        int y=1;
        Has
    }
}
