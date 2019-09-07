class output
{
    public static void main(String args[])
    {
        int a[]={21,14,61,81},s,i;
        for(i=0;i<4;i++)
        {
            s=a[i]+a[3-i];
            System.out.println(s);
        }
    }}