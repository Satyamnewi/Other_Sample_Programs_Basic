import java.util.*;
class neon
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,sq,div,dig,s=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        sq=n*n;
        for(div=sq;div>0;div/=10)
        {
            dig=div%10;
            s+=dig;
        }
        if(s==n)
        System.out.println("NEON NUMBER");
        else
        System.out.println("Not a NEON NUMBER");
    }
}
