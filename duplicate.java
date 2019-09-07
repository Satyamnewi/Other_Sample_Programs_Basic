import java.util.*;
class duplicate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int i,p=0,flag;
        System.out.println("Enter 5 no.s");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            flag=0;
            for(int j=0;j<p;j++)
            {
                if(a[i]==b[j])
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                b[p]=a[i];
                p++;
            }
        }
        System.out.println("After Eliminating Duplicate");
        for(i=0;i<p;i++)
        {
            System.out.println(b[i]);
        }
    }
}
    
            
