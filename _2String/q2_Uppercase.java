package Strings;

import javax.xml.stream.events.Characters;

public class q2_Uppercase 
{
    public static void main(String[] args) {
        
        String str = "i love programming";
        char x=Character.toUpperCase(str.charAt(0));
        String ans=String.valueOf(x);
        int n=str.length();
        for(int i=1; i<n; i++)
        {
            if(str.charAt(i)==' ')
            {
                char c=Character.toUpperCase(str.charAt(i+1));
                System.out.println(Character.isUpperCase('A'));

                ans+=String.valueOf(c);
                i++;
            }
            else
            {
                ans+=String.valueOf(str.charAt(i));
            }
        }
        System.out.println(ans);

    }
    
}
