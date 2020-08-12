 interface MyClass{
    public void fooMethod();

 }
 interface Hema {
     public void dooMethod();
 }
 class Demo1 implements MyClass,Hema{
    /* Must Override this method while extending
     * MyClas
     */
    public void fooMethod()
    {
        System.out.println("overriding abstract method");
    }
    public void dooMethod()
    {
        System.out.println("overriding abstract method");
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.fooMethod();
        Demo1 obc=new Demo1();
        obc.dooMethod();
    }
 }
    
