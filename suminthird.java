import java.util.*;
class suminthird
{
    public static void main(String args[])
    {                                
        Scanner in=new Scanner(System.in);                                                      
        int i,n,totalsum=0;                                                                                          
        System.out.println("Enter the value of n");                                              
        n=in.nextInt();                                                                       
        int a[]=new int[n];                                                                
        int b[]=new int[n];                                                               
        int sum[]=new int[n];                                                              
        System.out.println("Enter "+n+" elements in 1st array");                          
        for(i=0;i<n;i++)                                                                      
        {                                                                                    
            a[i]=in.nextInt();                                                                   
        }                                                                                  
        System.out.println("Enter "+n+" elements in 2nd array");                           
        for(i=0;i<n;i++)                                                                    
        {                                                                                
            b[i]=in.nextInt();                                                              
        }                                                                                  
        System.out.println("Sum of array 1 and 2 are as follows");                        
        for(i=0;i<n;i++)                                                          
        {                                                                              
           sum[i]=a[i]+b[i];                                                               
           System.out.println(sum[i]);                                             
        }                                                                           
        System.out.print("total sum is :-");                                      
        for(i=0;i<n;i++)                                                                    
        {                                                                         
             totalsum=sum[i]+totalsum;                                       
        }                                                                
        System.out.print(totalsum);                                       
     }
}                                                                            
            