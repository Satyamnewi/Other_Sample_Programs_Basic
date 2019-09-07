import java.io.*;
class binaryposition
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,mid,last,first,s,p=0;
        int a[]=new int[30];
        System.out.println("Enter 30 elements in ascending order");
        for(i=0;i<30;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter a data to search");
        s=Integer.parseInt(in.readLine());
        first=0;
        last=2;
        p=0;
        while(first<=last&&p==0)
        {
            mid=(first+last)/2;
            if(a[mid]==s)
            p=mid+1;
            else if(s>a[mid])
            first=mid+1;
            else
            last=mid-1;
        }
        if(p==0)
        System.out.println("Not found");
        else
        System.out.println("The number entered is present\nPosition is "+p);
    }
}