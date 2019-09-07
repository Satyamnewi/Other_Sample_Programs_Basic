import java.util.*;
class replace
{
    public static void main(String ars[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        char ch;
        int i,l;
        System.out.println("Enter a String");
        s=in.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            --ch;
            System.out.print(ch);
        }
    }
}