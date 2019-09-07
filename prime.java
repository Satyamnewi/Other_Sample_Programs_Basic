import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,c=0;
        System.out.println("Enter number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        System.out.println("Prime No.");
        else
        System.out.println("Not Prime No.");
    }
}




















