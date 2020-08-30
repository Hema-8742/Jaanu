interface check{  
    void allow(String msg);    
}  
public class SimpleFuncInter implements check{  
    public void allow(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        SimpleFuncInter f = new SimpleFuncInter();  
        f.allow("It is functional interface as it has only one abstract method");  
    }  
}  