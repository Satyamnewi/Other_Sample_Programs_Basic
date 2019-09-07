import java.util.*;
class vowelstring
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,s1="";
        int i,l;
        char ch;
        System.out.println("Enter a string");
        s=in.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                s1=s1+ch;
            }
        }
        System.out.println("New string consisting of vowel--"+s1);
    }
}