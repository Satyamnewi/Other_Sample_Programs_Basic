class pattern4
{
    public static void main(String args[])
    {
        int i,j,sp=8;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp-=2;
        }
    }
}