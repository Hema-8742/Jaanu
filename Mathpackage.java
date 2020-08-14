import java.lang.*; 
public class Mathpackage
{ 
    public static void main(String[] args) 
    { 
        int val1 = -5; 
        float val2 = .15f; 
        System.out.println("Initial value of int  : "+val1); 
        System.out.println("Initial value of int  : "+val2); 
        int Absi = Math.abs(val1); 
        float Absf = Math.abs(val2); 
  
        System.out.println("Absolute value of int : "+Absi); 
        System.out.println("Absolute value of int : "+Absf); 
        System.out.println(""); 
        double Acosi = Math.acos(60); 
        System.out.println("acos value of Acosi : "+Acosi); 
        double x = Math.PI; 
        x = Math.toRadians(x); 
        double Acosj = Math.acos(x); 
        System.out.println("acos value of Acosj : "+Acosj); 
          
    } 
} 