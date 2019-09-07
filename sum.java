import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int i,s=0,n;
        System.out.println("Enter the end of addition");
        n=in.nextInt();
        i=1;
        do
        {
            s+=i;
            i++;
        }
        while(i<=n);
        System.out.print("The sum is"+s);
    }
}
