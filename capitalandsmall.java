import java.util.*;
class capitalandsmall
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,s1="",s2="";
        int i,l;
        char ch;
        System.out.println("Enter a string");
        s=in.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                s1=s1+ch;
            }
            else if(Character.isLowerCase(ch))
            {
                s2=s2+ch;
            }
        }
        System.out.println("String of Capital letters---"+s1);
        System.out.println("String of Small letters---"+s2);
    }
}