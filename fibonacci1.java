import java.util.*;
class fibonacci1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,i,n;
        System.out.println("Enter the end of series");
        n=in.nextInt();
        a=0;
        b=1;
        for(i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}