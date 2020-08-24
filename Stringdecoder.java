import java.util.*; 
public class Stringdecoder { 
    public static void main(String[] args) 
    {  
        String decoderstring= "SSBzdGFydGVkIGxlYXJuaW5nIGVuY29kaW5n"; 
  
        System.out.println("Encoded String:\n"+ decoderstring);  
        byte[] actualByte = Base64.getDecoder().decode(decoderstring); 
  
        String actualString = new String(actualByte);  
        System.out.println("actual String:\n"+ actualString); 
    } 
} 