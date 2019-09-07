import java.util.*;
class gender2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,s1="",s2="";
        char ch,sp=' ';
        int i,l;
        System.out.println("Enter a name ");
        s=in.nextLine();
        l=s.indexOf(' ');
        ch=s.charAt(l-1);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||s.startsWith("miss")||s.startsWith("Mrs"))
        {
            System.out.println("Gender is Female ");
        }
        else
        {
            System.out.println("Gender is Male");
        }
    }
}
        