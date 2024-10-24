package Strings;

public class q9_ImplementStr {
    public static void main(String[] args)
    {

        String s = "GFeksForGeeks";
        String x = "For";

        int n=s.length();
        int m=x.length();


        for(int i=0;i<n; i++)
        {
            if(s.charAt(i)==x.charAt(0))
            {
                if(s.substring(i,i+m).equals(x))
                {
                    System.out.println(true);
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);



    }


}
