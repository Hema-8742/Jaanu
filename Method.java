public class Method
{
    public String myVar="instance variable";
    public void myMethod()
    {
        String myVar = "Inside Method";
        System.out.println(myVar);
    }
    public static void main(String args[])
    {
       Method obj = new Method();
       System.out.println("Calling Method");
       obj.myMethod();
       System.out.println(obj.myVar);
 
    }
 }