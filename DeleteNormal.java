import java.util.*;
class DeleteNormal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,l,p=0;
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
        System.out.println("After deleting the smallest element : ");
        for(i=0;i<n;i++)
        {
            if(i!=p)
            System.out.println(a[i]+"   ");
        }
    }
}