import java.util.*;
class duck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig,found=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            if(dig==0)
            {
                found=1;
                break;
            }
        }
            if(found==0)
            System.out.println("Not a DUCK NUMBER");
            else
            System.out.println("DUCK NUMBER");
        }
    }

    
    
    