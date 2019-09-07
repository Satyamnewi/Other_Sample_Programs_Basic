import java.io.*;
class lastindex
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        char ch;
        int index;
        System.out.println("Enter a String");
        s=in.readLine();
        System.out.println("Enter a character to search");
        ch=(char)in.read();
        index=s.lastIndexOf(ch);
        System.out.println("Last index of "+ch+" is "+index);
    }
}