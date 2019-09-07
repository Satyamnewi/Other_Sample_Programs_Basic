import java.util.*;
class evenwithoutmod
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long n,i,e,found=0,a;
        System.out.println("Enter the range upto which you have to find even");
        n=in.nextLong();
        System.out.println("Enter a no. to search even");
        e=in.nextLong();
        for(i=1;i<n;i++)
        {
            a=i*(1+1);
            if(a==e)
            {
                System.out.println("even");
            }
        }
    }
}
        

        