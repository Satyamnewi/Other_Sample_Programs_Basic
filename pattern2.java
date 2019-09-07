class pattern2
{
    public static void main(String args[])

{
    int i,j,sp=3,k=1;
    for(i=1;i<=7;i+=2)
    {
        for(j=1;j<=sp;j++)
        {
            System.out.print("    ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(k+"  ");
            k++;
        }
        System.out.println();
        sp--;
    }
}
}
    