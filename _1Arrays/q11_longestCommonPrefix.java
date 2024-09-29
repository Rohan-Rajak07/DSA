import java.util.Arrays;
import java.util.HashMap;

public class q11_longestCommonPrefix 
{
    public static void Approach1(String arr[])
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String s=arr[0];
        String e=arr[arr.length-1];
        int i=0;
        String ans="";
        while(i<s.length() && i<e.length())
        {
            if(s.charAt(i)==e.charAt(i))
            {
                ans+=String.valueOf(s.charAt(i));
                i++;
            }
            else
            {
                System.out.println(ans);
                return;
            }
        }

    }
    public static void main(String[] args) 
    {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        Approach1(arr);
       
    }
}
