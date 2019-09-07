import java.util.*;
class name
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1,s2,s3,rf,rl="";
        System.out.println("Enter three names ");
        s1=in.nextLine();
        s2=in.nextLine();
        s3=in.nextLine();
        rf=s1;
        rl=s1;
        if(s2.compareToIgnoreCase(rf)<0)
        {
            rf=s2;
        }
        if(s3.compareToIgnoreCase(rf)<0)
        {
            rf=s3;
        }
        if(s2.compareToIgnoreCase(rl)>0)
        {
            rl=s2;
        }
        if(s3.compareToIgnoreCase(rl)>0)
        {
            rl=s3;
        }
        System.out.println("Comes First "+rf);
        System.out.println("Comes Last "+rl);
        
    }
}
        
        