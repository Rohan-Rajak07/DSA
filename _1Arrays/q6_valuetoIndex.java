import java.util.ArrayList;
import java.util.List;

public class q6_valuetoIndex {
    public static void main(String[] args) 
    {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(1);
        list.add(4);
        for(int i=0; i<list.size(); i++)
        {
            int x=(int)list.get(i);
            if(x==i+1)
            System.out.println(x);
        }
    }
    
}
