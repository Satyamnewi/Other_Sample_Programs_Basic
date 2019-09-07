import java.util.*;
class lastfive
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        int i,l;
        char ch;
        System.out.println("Enter a String");
        s=in.nextLine();
        l=s.length();
        System.out.println("last five characters are ");
        for(i=l-1;i>=l-5;i--)
        {
            ch=s.charAt(i);
            System.out.print(ch);
        }
    }
}