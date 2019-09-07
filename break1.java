import java.util.*;
class break1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,s=0,n;
        System.out.println("Enter five numbers");
        
        for(i=1;i<=5;i++)
        {
        n=in.nextInt();
        if(n<0)
        break;
        s=s+n;
    }
    System.out.println("The sum is"+s);
}
}
        