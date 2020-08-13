//understanding the value of static keyword
public class Staticvar
{
    public static String a="jaanu";
     
    public static void main(String args[])
    {
       Staticvar obj1 = new Staticvar();
       Staticvar obj2 = new Staticvar();
       System.out.println(obj1.a);
       System.out.println(obj2.a);
       obj2.a = "Changed Text";
       System.out.println(obj1.a);
       System.out.println(obj2.a);
    }
 }