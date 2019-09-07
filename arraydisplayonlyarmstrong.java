import java.util.*;
class arraydisplayonlyarmstrong
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,s=0,dig,div,c;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            a[i]=in.nextInt();
        }
        System.out.println("Armstrong numbers are");
        for(i=0;i<5;i++)
        {
            s=0;
            for(div=a[i];div>0;div/=10)
            {
                dig=div%10;
                {
                    c=(int)Math.pow(dig,3);
                }
            s=s+c;
            if(s==a[i])
            System.out.println(a[i]);
    }
}
}
}
