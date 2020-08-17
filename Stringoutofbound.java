class Stringoutofbound
{ 
    public static void main(String args[]) 
    { 
        try 
        { 
            String a = "I have understood exceptions"; 
            char c = a.charAt(30);
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) 
        { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
}