import java.util.*;
class ISC2019Date
{
    int n,y,da,td=365;
    int mn[]={31,28,31,30,31,30,31,31,30,31,30,31};
    String month[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec",};
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number : ");
        n=in.nextInt();
        System.out.println("Enter the year :");
        y=in.nextInt();
        System.out.println("Enter the day after: ");
        da=in.nextInt();
    }
    void update()
    {
        if(y%4==0)
        {
            mn[1]=29;
            td = 366;
        }
        else
        {
            mn[1]=28;
            td = 365;
        }
    }
    void Dayshow(int dn)
    {
        int sum=0,dayno,tempsum = 0;
        for(int i=0;i<12;i++)
        {
            sum = sum + mn[i];
            if(dn<=31)
            {
                System.out.println(dn+"th "+month[0]+", "+y);
                break;
            }
            else if(dn<=sum)
            {
                for(int j=0;j<i;j++)
                    tempsum = tempsum + mn[j];
                dayno = dn - tempsum;
                System.out.println(dayno+"th "+month[i]+", "+y);
                break;
            }
            if(sum>=td)
            {
                sum = 0;
                i=0;
                y=y+1;
                dn = dn - td;
                update();
            }
        }
    }
    void display()
    {
        System.out.println("Original Date : ");
        Dayshow(n);
        update();
        System.out.println("After Original Date : ");
        Dayshow(n+da);
    }
    public static void main(String args[])
    {
        ISC2019Date ob = new ISC2019Date();
        ob.accept();
        ob.update();
        ob.display();
    }
}