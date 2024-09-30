class q16_CelebrityProblem
{
    public static void main(String[] args) {
        int ans=-1;
        int count=1;
        int ind=-1;
        int mat[][] ={{1,1,0}, {1,0,0}, {0,1,0}};
        int n=mat.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(mat[i][j]==1 && ind==j)
                {
                    ans=j;
                    System.out.println(ans);
                    return;
                }
                else if(mat[i][j]==1)
                {
                    ind=j;

                }
            }
        }
        System.out.println(ans);

    }
}