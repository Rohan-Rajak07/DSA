import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class q5_revInGroup {

    
    public static void main(String[] args) {
        ArrayList arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int k=3;
        System.out.println(arr);

        int n=arr.size();
        if(k>=n)
        {
            //Reverse whole array
            Collections.reverse(arr);
            System.out.println(arr);
        }
        else
        {
            int s=0;
            while(s<n)

        }
    }
    
}
