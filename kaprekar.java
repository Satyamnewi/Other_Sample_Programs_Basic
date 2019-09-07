import java.util.*;
class kaprekar
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        {
            int n,x,y,l,sq,mid;
            String s="",left,right;
            System.out.println("Enter a no.");
            n=in.nextInt();
            sq=n*n;
            if(sq<=9)
                s=s+" ";
                s=Integer.toString(sq);
                l=s.length();
                mid=l/2;
                left=s.substring(0,mid);
                System.out.println("Left "+left);
                right=s.substring(mid,l);
                System.out.println("Right "+right);
                x=Integer.parseInt(left);
                y=Integer.parseInt(right);
                if((x+y)==n)
                System.out.println("Kaprekar No.");
                else
                System.out.println("Not a Kaprekar No.");
            }
        }
    }
