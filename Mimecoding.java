import java.util.Base64;  
public class Mimecoding
{  
    public static void main(String[] args) 
    {  
        Base64.Encoder encoder = Base64.getMimeEncoder();  
        String message = "Hi, \nReceive all mails and reply";  
        String mStr = encoder.encodeToString(message.getBytes());  
        System.out.println("Encoded MIME message: "+mStr);   
        Base64.Decoder decoder = Base64.getMimeDecoder();   
        String dStr = new String(decoder.decode(mStr));  
        System.out.println("Decoded message: "+dStr);   
    }  
}  