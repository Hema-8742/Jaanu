import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader;
class Filenotfound { 
  
    public static void main(String args[]) 
     { 
        try
        { 
            File file = new File("E://Fullcreative.txt"); 
            FileReader fr = new FileReader(file); 
        }
        catch (FileNotFoundException e)
        { 
           System.out.println("File does not exist"); 
        } 
    } 
}