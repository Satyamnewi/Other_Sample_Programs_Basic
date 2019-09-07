import java.util.*;
class hcf
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long a,b,m,i,hcf=0,lcm=0;
        System.out.println("Enter two numbers");
        a=in.nextLong();
        b=in.nextLong();
        m=Math.min(a,b);
        for(i=1;i<=m;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                hcf=i;
                lcm=(a*b)/hcf;
            }
        }
        System.out.println("HCF is"+hcf);
        System.out.println("LCM is"+lcm);
    }
}













