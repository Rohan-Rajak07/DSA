package _2Strings;

public class q23_RotateString 
{
    public static void main(String[] args) 
    {
        String s="Rohan";
        String r="anRoh";

        String ans=s.substring(2,s.length())+s.substring(0, 2);
        if(ans.equals(r))
        {
            System.out.println("True");
            return;
        }
        String ans2=r.substring(2,s.length())+r.substring(0, 2);
        if(ans2.equals(s))
        {
            System.out.println(true+"2");

        }
        System.out.println(false);

    }
}
