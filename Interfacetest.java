 interface interf1{
    public void doMethod();

 }
 interface interf2 {
     public void tryMethod();
 }
 class Interfacetest implements interf1,interf2{
    public void doMethod()
    {
        System.out.println("overriding abstract method");
    }
    public void tryMethod()
    {
        System.out.println("overriding abstract method");
    }
    public static void main(String args[]){
    Interfacetest obj = new Interfacetest();
        obj.doMethod();
        Interfacetest obc=new Interfacetest();
        obc.tryMethod();
    }
 }
    
