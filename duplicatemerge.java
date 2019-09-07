import java.io.*;
class duplicatemerge
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,n,m,j,p=0,flag;
        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        System.out.println("Enter m");
        m=Integer.parseInt(in.readLine());
        int b[]=new int[m];
        int c[]=new int[m+n];
        int d[]=new int[m+n];
        System.out.println("Enter "+n+" elements");
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
        System.out.println("After eliminating duplicate elements");
        for(i=0;i<n;i++)
        {
            flag=0;
            for(j=0;j<m;j++)
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
        for(i=0;i<p;i++)
        {
            System.out.println(b[i]);
        }
    }
}
        