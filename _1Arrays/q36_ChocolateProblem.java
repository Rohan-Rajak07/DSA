import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * q36_ChocolateProblem 
 * https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?page=1&sprint=0c93a931d3a80dfc37524cc2c7d4e4fd&sortBy=submissions
 */
public class q36_ChocolateProblem 
{

    public static void main(String[] args) 
    {
        int m=3;
        ArrayList<Integer>l=new ArrayList<>(Arrays.asList(7, 3, 2, 4, 9, 12, 56));

        Collections.sort(l);
        int s=0;
        int e=m-1;
        int minAns=Integer.MAX_VALUE;
        while(e<l.size())
        {
            int x=l.get(s);
            int y=l.get(e);
            int diff=y-x;
            if(diff<minAns)minAns=diff;
            s++;
            e++;

        }
        System.out.println(minAns);



    }
}