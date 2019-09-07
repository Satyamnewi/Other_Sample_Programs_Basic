import java.io.*;
class binary
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n,i,mid,last,first,s,p=0;
        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in ascending order");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter a data to search");
        s=Integer.parseInt(in.readLine());
        first=0;
        last=n-1;
        p=0;
        while(first<=last&&p==0)
        {
            mid=(first+last)/2;
            if(a[mid]==s)
            {
                p=mid+1;
            }
            else if(s>a[mid])
            {
                first=mid+1;
            }
            else
            {
                last=mid-1;
            }
        }
        if(p==0)
        {
            System.out.println("Sorry not found");
        }
        else
        {
            System.out.println("Position is "+p);
        }
    }
}