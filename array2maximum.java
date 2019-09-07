import java.util.*;
class array2maximum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,max=0,max2=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            a[i]=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max2=max;
                max=a[i];
            }
            else if(a[i]>max2)
            {
                max2=a[i];
            }
        }
        System.out.println("2nd maximum is"+ max2);
    }
}