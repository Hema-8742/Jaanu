import org.w3c.dom.UserDataHandler;

interface Reference{  
    Username getName(String namw);  
}  
class Username{  
    Username(String name){  
        System.out.print(name);  
    }  
}  
public class Constructorref {  
    public static void main(String[] args) {  
       Reference ref= Username::new;  
        ref.getName("Surya");  
    }  
}