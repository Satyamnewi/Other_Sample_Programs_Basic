import java.util.*;
class twinprime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,c=0,c1=0,j,k=0;
        System.out.println("Enter 5 numbers");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Twin primes are");
        for(i=0;i<5;i++)
        {
            for(k=1,c=0;k<=a[i];k++)
            {
                if(a[i]%k==0)
                c1++;
            }
            if(c1==2)
            {
                for(j=i+1;j<5;j++)
                {
                    c=0;
                    for(k=1;k<=a[j];k++)
                    {
                        if(a[j]%k==0)
                        {
                            c++;
                        }
                    }
                    if(c==2&&(a[i]-a[j]==2||a[i]-a[j]==-2))
                    {
                        System.out.println(a[i]+" "+a[j]);
                    }
                    else
                    {
                        System.out.println("No twin primes are present in the array ");
                        
                    }
                }
            }
        }
    }
}