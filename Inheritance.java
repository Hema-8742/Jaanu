class TestInheritence
{
    void meth1()
    {
        System.out.println("You should know i belong to base class");
    }  
}  
class MainInheritance extends TestInheritence
{
    void meth2()
    {
        System.out.println("You should know i belong to child class");
    }  
}
class Inheritance
{  
    public static void main(String args[])
    {
        MainInheritance d=new MainInheritance();  
        d.meth1();  
        d.meth2();  
    }
}
