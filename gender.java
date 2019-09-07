import java.util.*;
class gender
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name,gender;
        System.out.println("Enter your name ");
        name=in.nextLine();
        name=name.toLowerCase();
        if(name.startsWith("mr"))
        {
            gender="Male";
        }
        else if(name.startsWith("miss")||name.startsWith("Mrs"))
        {
            gender="Female";
        }
        else
        {
            gender="Cannot Determine";
        }
        System.out.println("Gender is: "+gender);
    }
}