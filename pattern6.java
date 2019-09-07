class pattern6
{
    public static void main(String args[])
    {
        int i,k=1,c,j;
        for(i=1;i<=9;i=i+2)
        {
            c=0;
            k=i;
            for(j=i;j>=1;j=j-2)
            {
                System.out.print(k+" ");
                c++;
                k++;
            }
            System.out.println("="+c);
        }
    }
}













