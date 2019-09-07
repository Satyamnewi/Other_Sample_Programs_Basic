class series2
{
    public static void main(String args[])
    {
        int i,j;
        for(i=2;i<=8;i=i+2)
        {
            System.out.print(i+"  ");
            if(i==8)
            for(j=20;j<=80;j=j+20)
            {
                System.out.print(j+"  ");
            }
        }
    }
}