import java.util.HashSet;

public class q17_unionOfArray 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3};

        int ans=0;
        HashSet<Integer>hs=new HashSet<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            hs.add(arr1[i++]);
            hs.add(arr2[j++]);
        }
        while(i<arr1.length)
        {
            hs.add(arr1[i++]);
        }
        while(j<arr2.length)
        {
            hs.add(arr1[j++]);
        }
        System.out.println(hs.size());

    }
}
