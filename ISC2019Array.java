import java.util.*;
class ISC2019Array
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int t=0,i,k,j;
        System.out.println("Enter 5 numbers : ");
        for(i=0;i<5;i++)
          a[i]=in.nextInt();
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("After Sorting :");
        for(i=0;i<5;i++)
        System.out.println(a[i]+ " ");
        System.out.println("Array in particular pattern : ");
        for(i=4,k=0;i>=0;i--,k++)
        {
            for(j=0;j<=i;j++)
            System.out.print(a[j]+"  ");
            if(i!=4)
            {
                   for(j=0;j<k;j++)
                   System.out.print(a[j]+"  ");
            }
            System.out.println();
        }
    }
}