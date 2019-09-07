import java.util.*;
class sumofcommonfactors
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,a,b,m,s=0;
        System.out.println("Enter value of a and b");
        a=in.nextInt();
        b=in.nextInt();
        m=Math.min(a,b);
        System.out.println("Sum of common factors are");
        for(i=1;i<=m;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                s=s+i;
            }
        }
        System.out.println(s);
    }
}

























