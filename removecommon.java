import java.util.*;
class removecommon
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1,s2;
        int i,j,l1,l2;
        char ch1,ch2;
        boolean iscommon;
        System.out.println("Enter two string");
        s1=in.nextLine();
        s2=in.nextLine();
        l1=s1.length();
        l2=s2.length();
        for(i=0;i<l1;i++)
        {
            ch1=s1.charAt(i);
            iscommon=false;
            for(j=0;j<l2;j++)
            {
                ch2=s2.charAt(j);
                if(ch1==ch2)
                {
                    iscommon=true;
                    break;
                }
            }
            if(!iscommon)
            {
                System.out.print(ch1);
            }
        }
        for(i=0;i<l2;i++)
        {
            ch1=s2.charAt(i);
            iscommon=false;
            for(j=0;j<l1;j++)
            {
                ch2=s1.charAt(j);
                if(ch1==ch2)
                {
                    iscommon=true;
                    break;
                }
            }
            if(!iscommon)
            {
                System.out.print(ch1);
            }
        }
    }
}