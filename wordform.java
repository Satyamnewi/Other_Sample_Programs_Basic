import java.util.*;
class wordform
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig,rev=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            rev=(rev*10)+dig;
        }
        System.out.println("Result is");
        for(div=rev;div>0;div/=10)
        {
            dig=div%10;
            switch(dig)
            {
                case 0:
                System.out.print("Zero");
                break;
                case 1:
                System.out.print("One");
                break;
                case 2:
                System.out.print("Two");
                break;
                case 3:
                System.out.print("Three");
                break;
                case 4:
                System.out.print("Four");
                break;
                case 5:
                System.out.print("Five");
                break;
                case 6:
                System.out.print("Six");
                break;
                case 7:
                System.out.print("Seven");
                break;
                case 8:
                System.out.print("Eight");
                break;
                case 9:
                System.out.print("Nine");
                break;
            }
                System.out.print(" ");
            
        }
    }
}




















