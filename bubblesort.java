import java.util.*;
class bubblesort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,j,t;
        System.out.println("Enter 5 elements");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=1;i<5;i++)
        {
            for(j=0;j<5-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("After Sorting");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}