import java.util.*;
class multidimensionalarrayrightdiagnol
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[][]={
            {1,1,1,1,1},
            {1,1,0,0,1},
            {1,0,1,0,1},
            {1,0,0,1,1},
            {1,1,1,1,1}
        };
        int r,c;
        for(r=0;r<5;r++)
        {
            for(c=0;c<5;c++)
            {
                if(a[r][c]==0)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
        