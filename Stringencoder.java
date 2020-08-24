import java.util.*; 
public class Stringencoder
{ 
    public static void main(String[] args) 
    { 
        String check = "I started learning encoding";
        System.out.println("String:\n"+ check);
        String BasicBase64format = Base64.getEncoder().encodeToString(check.getBytes());
        System.out.println("String Encoded:\n"+ BasicBase64format); 
    } 
} 