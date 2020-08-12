//TRYING 2 inherit propertises of 2 classes
   abstract class MyClass{
    public void foo(){
      System.out.println("Concrete method of parent class");
    }
    abstract public void disp2();  

 }
 abstract class Hema{
     abstract public void disp3();
     public void foo(){
         System.out.println("I can take output");
     }
 }
 
 class Demo extends MyClass,Hema{
    /* Must Override this method while extending
     * MyClas
     */
    public void disp2()
    {
        System.out.println("overriding abstract method");
    }
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.foo();
        obj.disp2();
    }
 }
    
