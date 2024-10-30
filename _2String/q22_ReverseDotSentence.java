package _2Strings;

import java.util.ArrayList;
import java.util.Collections;

class q22_ReverseDotSentence
{
    public static void main(String[] args) 
    {
        String s = "i.like.this.program.very.much";

        ArrayList<String>l=new ArrayList<>();
        String word="";
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(c=='.')
            {
                l.add(word);
                word="";
            }
            else
            {
                word+=c;
            }
        }
        l.add(word);

        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        String ans=String.join(".",l);
        System.out.println(ans);




        // for(int i=0; i<l.size()-1; i++)
        // {
        //     ans+=l.get(i)+".";
        // }
        // ans+=l.get(l.size()-1);
        // System.out.println(ans);


    }
}