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
class Third extends MainInheritance
{
    void meth3()
    {
        System.out.println("You should know i belong to grandchild class");
    }


}
class Multilevel
{  
    public static void main(String args[])
    {
        Third d=new Third();  
        d.meth1();  
        d.meth2();
        d.meth3();  
    }
}