import java.util.Arrays;

public class q4_arraySubset {
    public static void main(String[] args) {
        int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int a2[] = {11, 3, 7, 1,7,7};
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        int j=0;
        int c=0;
        for(int i=0; i<a2.length; i++)
        {
            while(j<a1.length)
            {
                if(a1[j]==a2[i])
                {
                    c++;
                    j++;
                    break;
                }
                j++;
            }
        }
        if(c==a2.length){
            System.out.println(true);
        }
        else
        System.out.println(false);
    }

}
