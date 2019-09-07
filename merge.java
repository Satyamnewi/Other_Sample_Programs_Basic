import java.io.*;
class merge
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n,i;
        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n+n];
        System.out.println("Enter "+n+" elements");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter "+n+" numbers");
        for(i=0;i<n;i++)
        {
            b[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<n;i++)
        {
            c[i]=b[i];
        }
        for(i=0;i<n;i++)
        {
            c[n+i]=a[i];
        }
        System.out.println("After merging");
        for(i=0;i<2*n;i++)
        {
            System.out.println(c[i]);
        }
    }
}