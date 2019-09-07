import java.util.*;
class ISC2019String
{
    String s="",result="";
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string : ");
        s=in.nextLine();
        s=s+" ";
    }
    void traverse()
    {
        char ch;
        String w="",r="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                r=reverse(w);
                if(w.equalsIgnoreCase(r))
                result = result +" "+ w;
                else
                {
                    w=w+r;
                    result = result +" "+ w;
                }
                w="";
            }
        }
    }
    String reverse(String w)
    {
        char ch;
        String w2="";
        for(int i=0;i<w.length();i++)
        {
            ch=w.charAt(i);
            w2=ch+w2;
        }
        return w2;
    }
    void display()
    {
        System.out.println("Resultant String is : \n"+result.trim());
    }
    public static void main(String args[])
    {
        ISC2019String ob = new ISC2019String();
        ob.accept();
        ob.traverse();
        ob.display();
    }
}