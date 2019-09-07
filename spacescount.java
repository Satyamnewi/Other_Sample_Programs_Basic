import java.util.*;
class spacescount
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        int i,l;
        char ch;
        System.out.println("Enter a string");
        s=in.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.print((i+1)+"  ");
            }
        }
    }
}