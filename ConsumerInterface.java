import java.util.function.Consumer; 
  
public class ConsumerInterface { 
    public static void main(String args[]) 
    {  
        Consumer<Integer> display = a -> System.out.println(a); 
        display.accept(10);
    }
} 
  