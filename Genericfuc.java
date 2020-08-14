public class Genericfuc
{ 
    static<E>void genericFind(E element) 
    { 
        System.out.println(element);
    }
    public static void main(String[] args) 
    { 
        genericFind(10); 
   
        genericFind("Implementing generic functions"); 

        genericFind(3.0); 
    } 
}
   
