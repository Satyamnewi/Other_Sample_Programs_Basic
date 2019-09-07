import java.util.*;
class composite
{
    public static void main(String ars[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int a2[]=new int[5];
        int i,j,c=0,max=0;
        System.out.println("Enter 5 numbers");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Composite no.s are");
       
        for(i=0;i<5;i++)
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
            if(c>2)
            System.out.println(a2[i]);
        }
    }
}