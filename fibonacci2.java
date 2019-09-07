import java.util.*;
class fibonacci2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,n,i;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        a=5;
        b=10;
        for(i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}