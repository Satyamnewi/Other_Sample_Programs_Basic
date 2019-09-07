import java.util.*;
class index
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int index;
        String s;
        char ch;
        System.out.println("Enter a String and a character to search ");
        s=in.nextLine();
        ch=in.next().charAt(0);
        index=s.indexOf(ch);
        System.out.println("Result is :"+index);
    }
}