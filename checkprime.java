import java.util.*;
class checkprime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,j,c=0;
        System.out.println("Enter the end of series");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            System.out.print(i+" ");
            
    }
}
}
        