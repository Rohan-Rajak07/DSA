package _0Numbers;

public class q1_reverseNumber 
{
    public static void main(String[] args) 
    {
        int num=29002;
        // StringBuilder s=new StringBuilder(String.valueOf(n)).reverse();
        // String x=String.valueOf(s);
        // int ans=Integer.parseInt(x);
        // System.out.println(ans);


        //Replace 0 with 5--
        String s=String.valueOf(num);
        char[] arr=s.toCharArray();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]=='0')
            {
                arr[i]='5';
            }
        }
        String x=String.valueOf(arr);
        int ans=Integer.parseInt(x);
        System.out.println(ans);
        

    }
    
    
}