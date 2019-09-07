import java.util.*;
class mergereverse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int [5];
        int a2[]=new int [5];
        int a3[]=new int[10];
        int i;
         System.out.println("Enter 5 no.s of 1st array");
        for(i=0;i<5;i++)
        {
         a[i]=in.nextInt();
        }
        System.out.println("Enter 5 no.s of second array");
        for(i=0;i<5;i++)
        {
        a2[i]=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
        a3[i]=a[4-i];
        }
        System.out.println("merge in reverse");
        for(i=0;i<5;i++)
        {
        a3[i+5]=a2[4-i];
        }
    for(i=0;i<10;i++)
    {
        System.out.println(a3[i]);
    }
  }
}