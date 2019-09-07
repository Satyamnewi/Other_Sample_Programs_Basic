import java.util.*;
class automorphic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c=0,n,s,x,r,div,dig;
        System.out.println("Enter a number");
        n=in.nextInt();
        for(div=n;div>0;div/=10)
        {
            c++;
        }
        s=n*n;
        x=(int)Math.pow(10,c);
        r=s%x;
        if(r==n)
        System.out.println("AUTOMORPHIC NUMBER");
        else
        System.out.println("NOT AUTOMORPHIC NUMBER");
    }
}



















