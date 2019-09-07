import java.util.*;
class automorphiccheck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        int div,dig,c=0,s,x,r;
        System.out.println("Enter "+n+" elements");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Automorphic no.s are");
        for(i=0;i<n;i++)
        {
            div=0;
            s=0;
            x=0;
            r=0;
            c=0;
            for(div=a[i];div>0;div=div/10)
            {
                c++;
            }
            s=a[i]*a[i];
            x=(int)Math.pow(10,c);
            r=s%x;
            if(r==a[i])
            {
                System.out.println(a[i]);
            }
        }
    }
}
            