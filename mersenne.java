import java.util.*;
class mersenne
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,m,i;
        System.out.println("Enter the end of series");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
           m=(int)Math.pow(2,i);
           System.out.print(m-1+" ");
        }
    }
}















