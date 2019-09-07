import java.util.*;
class copyonlyevenfromonetoanotherarray
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int a2[]=new int[5];
        int i,k=0;
        System.out.println("Enter 5 numbers");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]%2==0)
            {
                a2[k]=a[i];
                k++;
            }
        }
        System.out.println("After copy");
        for(i=0;i<k;i++)
        {
            System.out.println(a2[i]);
        }
    }
}