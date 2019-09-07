import java.io.*;
class asciicharacter
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        char ch;
        System.out.println("Enter a character");
        ch=(char)in.read();
        if((ch>=65)&&(ch<=90))
        System.out.println("Capital Letter");
        else 
        System.out.println("Not a Capital Letter");
    }
}









































