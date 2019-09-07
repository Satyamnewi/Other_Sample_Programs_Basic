import java.util.*;
class primecheck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        int a2[]=new int[n];
        int i,j,c=0,max=0;
        System.out.println("Enter 5 numbers");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Prime no.s are");
       
        for(i=0;i<n;i++)
        {
            max=Math.max(a[i],max);
            c=0;
            for(j=1;j<=max;j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                    a2[i]=a[i];
                }
            }
            if(c==2)
            System.out.println(a2[i]);
        }
    }
}
        