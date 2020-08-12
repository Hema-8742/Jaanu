/*As we know that enum class’s
 object can’t be create explicitly so for initializing we using parameterized constructor*/
 enum Fruits
 { 
     MILK("WHITE"),DRINKS("BLACK"),SAUCE("RED"); 
     private String action;
     public String getAction() 
     { 
         return this.action; 
     }
     private Fruits(String action) 
     { 
         this.action = action; 
     } 
 } 
public class Enumobj
 { 
     public static void main(String args[]) 
     {
         Fruits[] colors=Fruits.values();
         for (Fruits color:colors) 
         {
             System.out.println("name : " +color.name() + 
                         " action: " +color.getAction() ); 
         } 
     } 
 }