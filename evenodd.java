import java.util.*;
class evenodd
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i=0,c=0,c1=0;
        System.out.println("Enter value of n");
        n=in.nextInt();
        int a[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Even arrays are");
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
          
                even[i]=a[i];
                
            }
            else if(a[i]%2==1)
            {
             
                odd[i]=a[i];
                
            }
            
            System.out.println(even[i]);
            
           }
             System.out.println("Odd arrays are");
             for(i=0;i<n;i++)
                 {
                  System.out.println(odd[i]);
                 }
              }
         }

            
            
            
            
            
            
            