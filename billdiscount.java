import java.util.*;
class billdiscount
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double p,q,b,d,nb;
        System.out.println("Enter the price and quantity");
        p=in.nextInt();
        q=in.nextInt();
        b=p*q;
        if(b>=10000)
        d=b*20/100;
        else if(b>=5000)
        d=b*10/100;
        else if(b>=2000)
        d=b*5/100;
        else
        d=0;
        nb=b-d;
        System.out.println("Bill is"+b);
        System.out.println("Discount is"+d);
        System.out.println("Net bill is"+nb);
    }
}
