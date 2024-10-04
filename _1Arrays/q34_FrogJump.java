import java.util.*;

public class q34_FrogJump 
{

    // https://www.geeksforgeeks.org/problems/frogs-and-jumps--170647/0


    public static void main(String[] args) 
    {

        int arr[]={1,3,5};
        int n = arr.length;
        int leaves = 6;

        HashSet<Integer>hs=new HashSet<>();
        int ans=0;

        for(int i=0; i<n; i++)
        {
            int x=arr[i];
            int sum=0;
            for(int j=0; j<=leaves; j=j+x)
            {
                if(j!=0)hs.add(j);
            }
        }
        System.out.println(hs);
        for(int i=1; i<=leaves; i++)
        {
            if(!hs.contains(i))
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
        
    }
}
