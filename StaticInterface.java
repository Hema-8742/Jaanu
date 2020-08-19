interface MyInterface
{
    default void newMethod()
    {  
        System.out.println("New default method");
    }
    static void anotherNewMethod(){
    	System.out.println("New static method");
    }
    void existingMethod(String str);  
}  
public class StaticInterface implements MyInterface
{
    public void existingMethod(String str)
    {           
        System.out.println("String is: "+str);  
    }
    public static void main(String[] args)
    {  
    	StaticInterface obj = new StaticInterface();
        obj.newMethod();    
        MyInterface.anotherNewMethod();
        obj.existingMethod("Checking use of static method in interfaces");
    }  
}