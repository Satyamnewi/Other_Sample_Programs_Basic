import java.util.*;
class binarytooctal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        int div,n,i=0,d,j;
        System.out.println("Enter a no.");
        n=in.nextInt();
        for(div=n;div>0;div/=2)
        {
            d=div%2;
            a[i]=d; 
            i++;    
        }
        System.out.println("In octal form");
        for(j=i-1;j>0;j--)
        {
            System.out.print(a[j]);
        }
    }
}