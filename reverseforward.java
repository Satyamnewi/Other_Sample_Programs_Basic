import java.util.*;
class reverseforward
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int n,div,dig,rev=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        System.out.println("The reversed digits are");
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            rev=(rev*10)+dig;
        }
        for(div=rev;div>0;div/=10)
        {
            dig=div%10;
            System.out.println(dig);
        }
    }
}