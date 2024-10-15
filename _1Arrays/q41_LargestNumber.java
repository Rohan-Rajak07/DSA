public class q41_LargestNumber 
{
    // https://www.geeksforgeeks.org/problems/largest-number-possible5028/1?page=3&difficulty=Easy&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions

    public static String MaxNum(int N, int S)
    {
        if(S==0)
        {
            if(N==1)return "0";
            return "-1";
        }

        if(S > 9*N) return "-1";

        int arr[] = new int[N];
        int i = 0;

        while (S > 0) 
        {
            if (S>=9) 
            {
                arr[i++]=9;
                S-=9;
            }
            else {
                arr[i++]=S;
                S=0;
            }
        }
        while (i < N) 
        {
            arr[i++] = 0;
        }

        StringBuilder result = new StringBuilder();
        for (int digit : arr)
        {
            result.append(digit);
        }
        return result.toString();

    }
    public static void main(String[] args) 
    {
        int N = 3, S = 20;
        System.out.println(MaxNum(N, S));
        
    }
}
