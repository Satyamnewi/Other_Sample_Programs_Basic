import java.util.*;
class evenoddfactors
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        {
            int n,i,se=0,so=0;
            System.out.println("Enter a number");
            n=in.nextInt();
            System.out.println("Factors are");
            for(i=1;i<=n;i++)
            {
                if((n%i==0)&&(i%2==0))
                se=se+i;
                else if((n%i==0)&&(i%2==1))
                so=so+i;
            }
            System.out.println("The sum of even"+se);
            System.out.println("The sum of odd"+so);
        }
    }
}
           
                    