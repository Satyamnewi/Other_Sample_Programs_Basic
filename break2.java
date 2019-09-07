import java.util.*;
class break2
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,s=0,c=0,n,av;
        System.out.println("Enter ten numbers");
        for(i=1;i<=10;i++)
        {
            n=in.nextInt();
            if(n<0)
            break;
            c++;
            s=s+n;
        }
        av=s/c;
        System.out.println("Average is"+av);
    }
}