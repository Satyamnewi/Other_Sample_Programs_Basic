import java.util.*;
class occurence
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,n,c=0;
        System.out.println("Enter 5 numbers");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter a no.s to search");
        n=in.nextInt();
        for(i=0;i<5;i++)
        {
            if(n==a[i])
            {
                i=i+1;
                c++;
                System.out.println("Present in "+i+"nd position");
             }
        }
        System.out.println("It is repeated "+c+" times");
    }
}