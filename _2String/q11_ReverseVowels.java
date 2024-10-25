package Strings;

public class q11_ReverseVowels 
{
    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i'  || c=='o' || c=='u')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        String s="practice";
        char arr[]=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            if(isVowel(arr[l]) && isVowel(arr[r]))
            {
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else if(isVowel(arr[l]))
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        String ans=String.valueOf(arr);
        System.out.println(ans);
    
    }
}
