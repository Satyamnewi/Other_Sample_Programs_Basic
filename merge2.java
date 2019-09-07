import java.io.*;
class merge2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,n,m;
        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        System.out.println("Enter m");
        m=Integer.parseInt(in.readLine());
        int b[]=new int[m];
        int c[]=new int[m+n];
        System.out.println("Enter "+n+ "elements");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter "+m+" elements");
        for(i=0;i<m;i++)
        {
            b[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<n;i++)
        {
            c[i]=a[i];
        }
        for(i=0;i<m;i++)
        {
            c[i+n]=b[i];
        }
        System.out.println("After merging");
        for(i=0;i<m+n;i++)
        {
            System.out.println(c[i]);
        }
    }
}