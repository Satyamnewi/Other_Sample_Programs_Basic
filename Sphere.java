class Sphere
{
    int radius;
    Sphere()
    {
        radius=3;
    }
    Sphere(int r)
    {
        radius=r;
    }
    double volSphere(int r)
    {
        return 4/3*3.14+radius*radius*radius;
    }
    public static void main(String args[])
    {
        Sphere s1=new Sphere(1);
        Sphere s2=new Sphere(6);
        System.out.println("Volume of sphere = "+s1.volSphere(1));
        System.out.println("Volume of sphere = "+s2.volSphere(1));
    }
}