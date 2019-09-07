import java.util.*;
class cyclicorder
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[20];
        int a2[]=new int[20];
        int i;
        System.out.println("Enter 20 numbers");
        for(i=0;i<20;i++)
        {
            a[i]=in.nextInt();
            a2[0]=a2[20-1];
            for(i=0;i<20-1;i++)
            {
                a2[i+1]=a[i];
            }
            System.out.println("After Arranging in cyclic order");
            for(i=0;i<20;i++)
            {
                System.out.println(a2[i]);
            }
        }
    }
}