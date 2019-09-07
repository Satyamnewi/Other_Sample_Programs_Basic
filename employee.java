import java.util.*;
class employee
{
    String empname;
    int empcode;
    double basicpay;
    employee()
    {
        empname="";
        empcode=0;
        basicpay=0.0;
    }
    employee(String n,int p,double q)
    {
        empname=n;
        empcode=p;
        basicpay=q;
    }
    double salarycal()
    {
        double special=0.0;
        double hra=0.3*basicpay;
        double da=0.4*basicpay;
        double salary=basicpay+hra+da;
        if((empcode<=15)&&(salary<=15000))
        {
            special=0.2*salary;
            if(special>2500)
            special=2500;
        }
        else
        {
            special=1000;
        }
        double totalsalary=salary+special;
        return totalsalary;
    }
}