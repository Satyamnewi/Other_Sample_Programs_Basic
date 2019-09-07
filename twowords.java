import java.util.*;
class twowords
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,w="";
        char ch;
        int i,l,ios=0;
        System.out.println("Enter a String");
        s=in.nextLine();
        l=s.length();
        ios=s.indexOf(' ');
        for(i=ios;i<l;i++)
        {
            ch=s.charAt(i);
            w=w+ch;
        }
        System.out.println("Last word is..."+w);
    }
}