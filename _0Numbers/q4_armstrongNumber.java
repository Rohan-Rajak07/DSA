package _0Numbers;

class q4_armstrongNumber
{
    public static void main(String[] args) 
    {
        int n=152;
        int ans=0;
        String s=String.valueOf(n);
        for(int i=0; i<s.length(); i++)
        {
            int no=(s.charAt(i) -'0');
            int pow=(int)Math.pow(no,3);
            ans+=pow;
        }
        System.out.println(ans);
        if(n==ans)System.out.println(true);
        else System.out.println(false);

    }
}