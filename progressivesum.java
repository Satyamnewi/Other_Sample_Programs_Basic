import java.util.*;
class progressivesum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,s=0;
        System.out.println("Enter the end term of series");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+i;
            System.out.print(s+" ");
        }
    }
}
















