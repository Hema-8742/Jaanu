interface MyInterface
{
    default void newMethod()
    {
        System.out.println("Newly added default method");  
    } 
    void existingMethod(String str);  
}  
public class Defaultmethod implements MyInterface
{
    public void existingMethod(String str)
    {           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args)
    {  
    	Defaultmethod obj = new Defaultmethod();
        obj.newMethod();
        obj.existingMethod("To see how default method works");
    }  
}