//TRYING 2 inherit propertises of 2 classes
   abstract class Class1{
    public void method1(){
      System.out.println("Concrete method of parent class");
    }
    abstract public void disp2();  

 }
 abstract class Class2{
     abstract public void disp3();
     public void method2(){
         System.out.println("I can take output");
     }
 }
 
 class Class3 extends Class1,Class2{
    public void method1()
    {
        System.out.println("overriding abstract method");
    }
    public static void main(String args[]){
        Class3 obj = new Class3();
        obj.method1();
        obj.method2();
    }
 }
    
