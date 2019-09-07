import java.util.*;
class perfectnofind
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int i,n,j,s=0;
        System.out.println("Enter the end of series");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            s=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    s=s+j;
                }
            }
            if(s==i)
            System.out.print(i+" ");
        }
    }
}
            
        