import java.util.*;
class telcall
{
    int phno;
    int n;
    double amt;
    String name;
    telcall(int x,String y,int k)
    {
        phno=x;
        name=y;
        n=k;
        amt=0.0;
    }
    void compute()
    {
        if(n<=100)
        amt=500;
        if(n>=101&&n<=200)
        amt=500+(n-100)*1.00;
        if(n>=201&&n<=300)
        amt=500+100+(n-200)*1.20;
        if(n>300)
        amt=500+100+120+(n-300)*1.50;
    }
    void display()
    {
        System.out.println("Phone number "+"\t"+" Name"+"\t"+"Total Calls"+"\t"+"Amount"+"\t");
        System.out.println(phno+"\t"+name+"\t"+n+"\t"+amt);
    }
}