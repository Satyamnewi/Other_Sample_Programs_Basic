import java.util.*;
class salarypost
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int s;
        System.out.println("Enter the salary");
        s=in.nextInt();
        if(s>=50000)
        {
            System.out.println("CEO");
        }
        else if(s>=40000)
        {
            System.out.println("MANAGER");
        }
        else if(s>=30000)
        {
            System.out.println("SUPERVISOR");
        }
        else
        {
            System.out.println("EXECUTIVE");
        }
    }
}