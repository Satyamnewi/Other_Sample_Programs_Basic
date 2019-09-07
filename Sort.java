import java.util.*;
class Sort
{
    int arr[]=new int[100];
    int size;
    Sort()
    {
        for(int i=0;i<100;i++)
        arr[i]=0;
        size=0;
    }
    void inpdata()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size");
        size=in.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
    }
    void InsSort()
    {
        int i,j,t=0,min;
        for(i=0;i<9;i++)
        {
            min=i;
            for(j=i+1;j<10;j++)
            {
                if(arr[j]>arr[min])
                {
                    min=j;
                }
            }
                t=arr[i];
                arr[i]=arr[min];
                arr[min]=t;
        }
    }
    void display()
    {
        System.out.println("Result is: ");
        for(int i=0;i<size;i++)
        System.out.println(arr[i]);
    }
}