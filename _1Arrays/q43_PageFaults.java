import java.util.*;
public class q43_PageFaults 

{
    // https://www.geeksforgeeks.org/problems/page-faults-in-lru5603/1?page=3&difficulty=Easy&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
    public static void main(String[] args) 
    {
        int n=9;
        int c=4;
        int page[]={5, 0, 1, 3, 2, 4, 1, 0, 5};

        // ArrayList<Integer>l=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();

        int count=0;
        for(int i=0; i<page.length; i++)
        {
            if(!q.contains(page[i]))
            {
                count++;
                q.add(page[i]);
                if(q.size()>c)
                {
                    q.remove();
                }
            }
            else
            {
                q.remove(page[i]);
                q.add(page[i]);
            }
        }
        System.out.println(count);

    }
}
