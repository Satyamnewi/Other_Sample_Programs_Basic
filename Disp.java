class Disp
{
    double u,s,t,a;
    Disp(double u1,double t1,double a1)
    {
        u=u1;
        t=t1;
        a=a1;
    }
    double displacement()
    {
        return s=u*t+1/2.0*a*t*t;
    }
    public static void main(String args[])
    {
        Disp d1=new Disp(20,100,10);
        System.out.println("The Displacement is "+d1.displacement());
    }
}