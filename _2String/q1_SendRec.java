package Strings;

public class q1_SendRec 
{
    // SAP LABS Q1 that i get in exam and unable to solved it-----Ah----
    public static void main(String[] args) 
    {
        String s="abcdefghij";
        String r="abcdefghij";
        String ans="";
        int i=0;
        int j=0;
        int n1=s.length();
        int n2=r.length();
        while(i<n1)
        {
            if(n2<=i)
            {
                String x=s.substring(i, n1);
                ans+=x;
                System.out.println(ans);
                return;

            }
            else if(s.charAt(i)!=r.charAt(j))
            {
                ans+=String.valueOf(s.charAt(i));
                i++;
            }
            else
            {
                i++;
                j++;
            }
        }
        System.out.println(ans);
        
    }
    
}
