interface Functional{  
    void fun();  
}  
public class InstanceMethodref {  
    public void doIt(){  
        System.out.println("Instance method referencing using method references.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodref methodReference = new InstanceMethodref();
        Functional f = methodReference::doIt; 
        f.fun();
    }  
}  