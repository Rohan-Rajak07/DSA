import java.util.*;

public class q28_CommonELement 
{
    // Given two lists V1 and V2 of sizes n and m respectively. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.
    public static void main(String[] args) 
    {
        int v1[] = {3, 4, 2, 2, 4};
        int v2[] = {3, 2, 2, 7};

        HashSet<Character>hs=new HashSet<>();
        hs.add('a');
        hs.add('b');
        hs.add('c');
        System.out.println(hs);
        hs.removeAll(hs);
        System.out.println(hs);
        
        
        
    }
}
