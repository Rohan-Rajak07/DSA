package Strings;

public class q7_smallDistinctWindow 
{
    public static void main(String[] args) 
    {
        String s="AABBBCBBAC";
        int i=0,j=1;
        int maxlen=0;
        while(j<s.length())
        {

            for(int a=i; a<j; a++)
            {
                if(s.charAt(a)==s.charAt(j))
                {
                    i=j;
                    j++;
                    break;
                }
                else
                {
                    int len=(j-i)+1;
                    if(len>maxlen) maxlen=len;
                }
            }
            j++;
        }
        System.out.println(maxlen);
    }
}
