import java.util.*;
class series
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,f=1,j;
        System.out.println("Enter number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            f=1;
            for(j=1;j<=i;j++)
            {
                f=f*j;
            }
            System.out.print(f+"  ");
        }
    }
}