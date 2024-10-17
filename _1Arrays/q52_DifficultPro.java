/**
 * q52_DifficultPro
 * https://www.geeksforgeeks.org/problems/difficult-problems1303/1?page=1&category=Pattern%20Searching&difficulty=Basic&sortBy=submissions
 */
public class q52_DifficultPro 
{
    static int difProblem(String N) 
    {
        // code here
        int incre=1;
        int decre=1;
        int n=N.length();
        for(int i=0; i<n-1; i++)
        {
            int val1=(N.charAt(i)-'0');
            // System.out.println(val1);
            int val2=(N.charAt(i+1)-'0');
            if(val1<=val2)incre++;
            else decre++;
        }
        if(incre==n || decre==n)return 1;
        return 0;
    }
    public static void main(String[] args) 
    {
        String N = "5431";
        System.out.println(difProblem(N));
    }
}