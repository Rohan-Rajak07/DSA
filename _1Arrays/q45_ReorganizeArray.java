import java.util.*;

public class q45_ReorganizeArray 
{
    public static void bruteForce(ArrayList<Integer>arr,int n)
    {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++) l.add(-1);

        for(int i=0;i<n;i++)
        {
            if(arr.get(i)!=-1)
            l.set(arr.get(i),arr.get(i));
        }
        System.out.println(l);

    }
    public static void main(String[] args) 
    {
       ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(-1, -1, 6, 1, 9, 3, 2, -1, 4, -1));
       int n=arr.size();

        bruteForce(arr, n);




    }
}
