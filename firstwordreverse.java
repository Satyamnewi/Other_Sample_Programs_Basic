import java.util.*;
class firstwordreverse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,word="";
        int i,l;
        char ch;
        System.out.println("Enter a String");
        s=in.nextLine();
        s+=" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                break;
            }
            else
            {
                word=ch+word;
            }
        }
        System.out.println("First word in reverse=="+word);
    }
}