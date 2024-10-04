import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class q33_Sort012 
{

    public static void main(String[] args) 
    {
        int rr[]={0,2,1,2,0,1};
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(2,0,2));
        int n=arr.size();

        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            hm.put(arr.get(i),hm.getOrDefault(arr.get(i),0)+1);
        }
        System.out.println(hm);
        int a=hm.get(0);
        int b=hm.get(1);
        int c=hm.get(2);
        System.out.println(a+" "+b+" "+c);
        arr.removeAll(arr);
        for(int i=0; i<n; i++)
        {
            if(a-->0)
            {
                arr.add(0);
                // a--;
            }
            else if(b-->0)
            {
                arr.add(1);
                // b--;
            }
            else
            {
                arr.add(2);
            }
        }
        System.out.println(arr);
        
    }
}
