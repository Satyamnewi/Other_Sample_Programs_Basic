import java.util.*;
class arraydisplayonlyprime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,c=0,j;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a numbers");
            a[i]=in.nextInt();
        }
        System.out.println("Prime no's are");
        for(i=0;i<5;i++)
        {
            c=0;
            for(j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                }
            }
        
            if(c==2)
            System.out.println(a[i]);
        }
    }
}
