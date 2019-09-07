import java.util.*;
class arraydisplayonlyautomorphic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,div,dig,c=0,s,x,r;
        System.out.println("Enter 5 numbers");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Automorphic numbers");
        for(i=0;i<5;i++)
        {
            c=0;
            for(div=a[i];div>0;div/=10)
            {
                c++;
            }
            s=a[i]*a[i];
            x=(int)Math.pow(10,c);
            r=s%x;
            if(r==a[i])
            System.out.println(a[i]);
        }
    }
}
