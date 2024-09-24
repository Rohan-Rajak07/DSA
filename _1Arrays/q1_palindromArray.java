package _1Arrays;


class q1_palindromeArray
{
    
    public static void main(String args[])
    {
        int arr[]={111,22,333,444,555};
        for(int i=0; i<arr.length; i++)
        {
            String x=String.valueOf(arr[i]);
            int len=x.length();
            int s=0;
            int e=len-1;
            while(s<=e)
            {
                if(x.charAt(s)!=x.charAt(e))
                {
                    System.out.println(false);
                    return;
                }
                else
                {
                    s++;
                    e--;
                }
            }
        }
        System.out.println(true);
        return;
    }
}