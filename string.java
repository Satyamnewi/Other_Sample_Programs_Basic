import java.util.*;
class string
{
    String str,rev;
    string()
    {
        str=rev="";
    }
    void inputstring()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        str=in.nextLine();
    }
    void getprocess()
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+rev);
    }
    void findvalue()
    {
        int c=0;
        StringTokenizer S=new StringTokenizer(str);
        while(S.hasMoreTokens())
        {
            str=S.nextToken();
            c++;
        }
        System.out.println("Total words: "+c);
        System.out.println("Total spaces: "+(c-1));
    }
    public static void main(String args[])
    {
        string ob=new string();
        ob.inputstring();
        ob.getprocess();
        ob.findvalue();
    }
}