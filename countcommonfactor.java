import java.util.*;
class countcommonfactor
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,m,i,c=0;
        System.out.println("Enter a and b");
        a=in.nextInt();
        b=in.nextInt();
        m=Math.min(a,b);
        System.out.println("Number of Common factors are");
        for(i=1;i<=m;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                c++;
              
            }
        }
          System.out.println(c+" ");
    }
}
    
        
        