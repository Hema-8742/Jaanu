import java.util.List;
import java.util.ArrayList;
public class Foreachstream{
   public static void main(String[] args) {
    ArrayList<String> products= new ArrayList<String>();
    products.add("AW");
    products.add("SWITCHBOARD");
    products.add("ADAPTIVEU");
    products.add("TELEPORT"); 
    products.add("ANSWERCONNECT");
    products.stream() 
    .filter(f->f.startsWith("A"))  
    .forEach(System.out::println);
   }
}