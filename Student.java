//Pg 211-1uestion 6-Sumita
class Student
{
    String name;
    double test1,test2,test3;
    Student(String theName,double t1,double t2,double t3)
    {
        name=theName;
        test1=t1;
        test2=t2;
        test3=t3;
    }
    String getName()
    {
        return name;
    }
    double getAverage()
    {
        return (test1+test2+test3)/3;
    }
    public static void main(String args[])
    {
        Student stu1=new Student("Satyam",99,100,98);
        Student stu2=new Student("Raj",47,58,87);
        System.out.println(stu1.getName()+" has average score of: "+stu1.getAverage());
        System.out.println(stu2.getName()+" has average score of: "+stu2.getAverage());
    }
}
