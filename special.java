import java.util.*;
class special
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig,i,f,s=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            f=1;
            for(i=1;i<=dig;i++)
            {
                f=f*i;
            }
            s=s+f;
        }
        if(s==n)
        System.out.println("It is a special No.");
        else
        System.out.println("Not a special No.");
    }
}






















