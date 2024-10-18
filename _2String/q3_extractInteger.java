package Strings;

import java.util.ArrayList;

public class q3_extractInteger
{
    public static void main(String[] args) 
    {
        String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,3: Rishabh Gupta56";
        ArrayList<String>list=new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                list.add(String.valueOf(c));
            }
        }
        System.out.println(list);

    }
    
}
