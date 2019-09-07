import java.util.*;
class magic                                            //Eventual sum is 1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig=0,s=0,div2,dig2=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            s=s+dig;
        }
        for(div2=s;div2>0;div2/=10)
        {
            dig2=div2%10;
            
        }
        if(dig2==1)
            System.out.println("Magic No.");
            else
            System.out.println("Not a Magic No.");
    }
}