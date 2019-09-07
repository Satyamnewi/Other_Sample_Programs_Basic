import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        int i,max=0;
        System.out.println("Enter ten numbers from user");
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            max=Math.max(a[i],max);
        }
        System.out.println("Maximum of entered numbers is"+max);
    }
}