package _2Strings;

public class q14_LongestCommonString 
{
    public static void main(String[] args) 
    {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        int ans=0;
        int n=str1.length();
        int m=str2.length();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                int c=0;
                if(str1.charAt(i)==str2.charAt(j))
                {
                    int a=i,b=j;
                    while(a<n && b<m)
                    {
                        if(str1.charAt(a)==str2.charAt(b))
                        {
                            c++;
                            a++;
                            b++;
                        }
                        else
                        {
                            break;
                        }
                    }
                    if(c>ans) ans=c;
                }
            }
        }
        System.out.println(ans);

    }
}
