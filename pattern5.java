class pattern5
{
    public static void main(String args[])
    {
        int i,j,sp=4;
        for(i=1;i<=9;i+=2)
        {
            for(j=1;j<=sp;j+=1)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j+=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            sp--;
        }
    }
}
            









