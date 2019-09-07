import java.util.*;
class DeleteWithShift
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,l,p=0,j;
        System.out.println("Enter size of array : ");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        l=a[0];
        for(i=0;i<n;i++)
        {
             if(a[i]<l)
             {
                 l=a[i];
                 p=i;
             }
        }
        for(i=0;i<n;i++)
        {
            if(i==p)
            {
                for(j=i;j<n-1;j++)
                a[j]=a[j+1];
            }
        }
        System.out.println("After deleting and shifting : ");
        for(i=0;i<n-1;i++)
        {
            System.out.println(a[i]+"   ");
        }
    }
}